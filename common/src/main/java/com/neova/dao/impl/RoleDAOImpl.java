/**
 * 
 * RoleDAOImpl.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */
package com.neova.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neova.dao.RoleDAO;
import com.neova.model.Role;

/**
 * This is implementation of RoleDAO interface in package com.neova.dao
 * 
 *  
 * @author Mahendra Bagul
 * 
 * Neova Solutions Pvt. Ltd.
 *
 */

@Repository
public class RoleDAOImpl implements RoleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * Given the id, gets role from current session
	 *
	 * @param    id    role id of which role want to get extracted
	 * 
	 * @return    role     returns role corresponding to id
	 * 
	 */
	public Role getRole(int id) {
		Role role = (Role) getCurrentSession().load(Role.class, id);
		return role;
	}

}
