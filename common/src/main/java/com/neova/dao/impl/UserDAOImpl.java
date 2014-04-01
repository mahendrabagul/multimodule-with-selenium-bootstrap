/**
 * 
 * UserDAOImpl.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */
package com.neova.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neova.dao.UserDAO;
import com.neova.model.User;

/**
 * This is implementation of UserDAO interface in package com.neova.dao
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session openSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Given the id, gets role from current session
	 * 
	 * @param login
	 *            login is username of user
	 * 
	 * @return user if username exists in database
	 * 
	 * @return null if username doesn't exist in database
	 * 
	 */

	@Override
	public User getUser(String login) {
		Query query = openSession().createQuery(
				"from User u where u.login = :login");
		query.setParameter("login", login);
		return (User) query.list().get(0);
	}

	/**
	 * 
	 * For Sign Up Form
	 * 
	 * @author Mahendra Bagul
	 * 
	 * 
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public Integer getNextId(){
		List<User> last = sessionFactory.getCurrentSession().createQuery("from User order by id DESC LIMIT 1").list();
		return last.get(0).getId()+1;
	}
	@Override
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	
	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}
	
	@Override
	public User getUserById(int userId) {
		return (User) sessionFactory.getCurrentSession()
				.get(User.class, userId);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		return criteria.list();
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("UserID in DAOImpl class:"+ user.getId());
		/*Query query = session.createQuery("delete Stock where stockCode = '7277'");
		int result = query.executeUpdate();
		*/
		
		sessionFactory.getCurrentSession().createQuery(
				"DELETE FROM User WHERE id = " + user.getId()).executeUpdate();
	}
	/**
	 * End Of Edit
	 */

}
