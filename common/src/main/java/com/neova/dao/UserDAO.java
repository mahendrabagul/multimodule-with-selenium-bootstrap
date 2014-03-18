/**
 * 
 * UserDAO.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */

package com.neova.dao;
import com.neova.model.User;

/**
 * This is interface used for getting user from database
 * 
 * 
 * @author Mahendra Bagul
 * 
 * Neova Solutions Pvt. Ltd.
 *
 */

public interface UserDAO {
	
	public User getUser(String login);

}
