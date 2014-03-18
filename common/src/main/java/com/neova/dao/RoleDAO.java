/**
 * 
 * RoleDAO.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */
package com.neova.dao;

import com.neova.model.Role;

/**
 * This is interface used for getting role of particular user from database
 * 
 * 
 * @author Mahendra Bagul
 * 
 * Neova Solutions Pvt. Ltd.
 *
 */
public interface RoleDAO {
	
	public Role getRole(int id);

}
