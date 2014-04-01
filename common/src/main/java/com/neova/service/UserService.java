/**
 * 
 * UserService.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */
package com.neova.service;

import java.util.List;

import com.neova.model.User;

/**
 * This is interface
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */
public interface UserService {

	public User getUser(String login);

	/**
	 * @author Mahendra Bagul Edit for Sign up Form
	 * 
	 * 
	 */

	void insertUser(User user);
	Integer getNextId();
	User getUserById(int userId);

	List<User> getUsers();

	void deleteUser(User user);

	void updateUser(User user);

	/**
	 * End Of Edit
	 */
}
