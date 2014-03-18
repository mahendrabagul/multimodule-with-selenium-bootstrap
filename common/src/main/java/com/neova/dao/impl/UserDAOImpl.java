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
import java.util.ArrayList;
import java.util.List;

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
 * Neova Solutions Pvt. Ltd.
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
	 * @param    login    login is username of user
	 *  
	 * @return    user 	  if username exists in database 
	 * 	
	 * @return    null	  if username doesn't exist in database  
	 * 
	 */
	
	@SuppressWarnings("unchecked")
	public User getUser(String login) {
		List<User> userList = new ArrayList<User>();
		Query query = openSession().createQuery("from User u where u.login = :login");
		query.setParameter("login", login);
		userList = query.list();
		if (userList.size() > 0)
			return userList.get(0);
		else
			return null;	
	}

}
