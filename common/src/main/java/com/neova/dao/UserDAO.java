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

import java.util.List;

import com.neova.model.User;

/**
 * This is interface used for getting user from database
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */

public interface UserDAO {

	public User getUser(String login);

	/**
	 * For SignUp Form...
	 * 
	 * @param user
	 */
	void insertUser(User user);

	User getUserById(int userId);

	List<User> getUsers();

	void deleteUser(User user);

	void updateUser(User user);

	Integer getNextId();

	/**
	 * End Of Edit
	 */

}
