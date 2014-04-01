/**
 * 
 * UserServiceImpl.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */

package com.neova.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neova.dao.UserDAO;
import com.neova.model.User;
import com.neova.service.UserService;

/**
 * This is implementation of UserService interface
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User getUser(String login) {
		return userDAO.getUser(login);
	}

	/**
	 * For SignUp Form...
	 * 
	 * @param user
	 */

	@Override
	@Transactional
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

	@Override
	@Transactional
	public User getUserById(int userId) {
		return userDAO.getUserById(userId);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	
	
	@Override
	@Transactional
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	@Override
	@Transactional
	public Integer getNextId() {
		return userDAO.getNextId();
	}

	/**
	 * End Of Edit
	 */
}
