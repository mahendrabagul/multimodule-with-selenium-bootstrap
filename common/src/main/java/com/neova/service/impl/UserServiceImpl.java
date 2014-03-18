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

}
