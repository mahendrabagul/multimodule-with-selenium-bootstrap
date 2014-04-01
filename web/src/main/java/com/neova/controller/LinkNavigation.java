/**
 * 
 * LinkNavigation.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */
package com.neova.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neova.bean.UserBean;
import com.neova.model.User;
import com.neova.service.UserService;

/**
 * This is LinkNavigation
 * 
 * It is controller which reacts to all user requests
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */
@Controller
public class LinkNavigation {

	public LinkNavigation() {
	}

	/**
	 * Edited for sign up form
	 */

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/sec/moderation", method = RequestMethod.GET)
	public ModelAndView listUsers() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userList", prepareListofBean(userService.getUsers()));
		return new ModelAndView("moderation", model);
	}

	@RequestMapping(value = "/admin/save", method = RequestMethod.POST, params = { "save" })
	public ModelAndView saveUser(@RequestParam String save,
			@ModelAttribute("command") UserBean userBean, BindingResult result) {
		User user = prepareModel(userBean);
		userService.insertUser(user);
		return new ModelAndView("redirect:/admin/first.html");
	}

	@RequestMapping(value = "/admin/save", method = RequestMethod.POST, params = { "update" })
	public ModelAndView updateUser(@RequestParam String update,
			@ModelAttribute("command") UserBean userBean, BindingResult result) {
		User user = prepareModel(userBean);
		if (user.getId() != 0) {
			userService.updateUser(user);
		} else {
			System.out.println("Updation Failed due to value of id="+user.getId());
		}
		return new ModelAndView("redirect:/admin/first.html");
	}

	@RequestMapping(value = "/admin/first", method = RequestMethod.GET)
	public ModelAndView addEmployee(
			@ModelAttribute("command") UserBean userBean, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", userBean);
		model.put("userList", prepareListofBean(userService.getUsers()));
		return new ModelAndView("admin-first", model);
	}

	// /////////////////////////////////////////////

	@RequestMapping(value = "/admin/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(
			@ModelAttribute("command") UserBean userBean, BindingResult result) {
		userService.deleteUser(prepareModel(userBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", null);
		model.put("userList", prepareListofBean(userService.getUsers()));
		return new ModelAndView("admin-first", model);
	}

	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
	public ModelAndView editUser(@ModelAttribute("command") UserBean userBean,
			BindingResult result) {

		Map<String, Object> model = new HashMap<String, Object>();
		UserBean userBeanFromDB = prepareUserBean(userService
				.getUserById((userBean.getId())));

		model.put("user", userBeanFromDB);
		model.put("userList", prepareListofBean(userService.getUsers()));
		return new ModelAndView("admin-first", model);
	}

	// /////////////////////////////////////////////

	private List<UserBean> prepareListofBean(List<User> users) {
		List<UserBean> beans = null;
		if (users != null && !users.isEmpty()) {
			beans = new ArrayList<UserBean>();
			UserBean bean = null;
			for (User user : users) {
				bean = new UserBean();
				bean.setId(user.getId());
				bean.setLogin(user.getLogin());
				bean.setPassword(user.getPassword());
				bean.setFirstName(user.getFirstName());
				bean.setLastName(user.getLastName());
				bean.setCountry(user.getCountry());
				bean.setMobileNo(user.getMobileNo());
				bean.setEmailId(user.getEmailId());
				beans.add(bean);
			}
		}
		return beans;
	}

	/*
	 * private User prepareModelForSaveAndUpdate(UserBean userBean) { User user
	 * = new User(); user.setLogin(userBean.getLogin());
	 * user.setPassword(userBean.getPassword());
	 * user.setFirstName(userBean.getFirstName());
	 * user.setLastName(userBean.getLastName());
	 * user.setCountry(userBean.getCountry());
	 * user.setEmailId(userBean.getEmailId());
	 * user.setMobileNo(userBean.getMobileNo()); userBean.setId(0); return user;
	 * }
	 */

	private UserBean prepareUserBean(User user) {
		UserBean bean = new UserBean();
		bean.setFirstName(user.getFirstName());
		bean.setLastName(user.getLastName());
		bean.setLogin(user.getLogin());
		bean.setPassword(user.getPassword());
		bean.setEmailId(user.getEmailId());
		bean.setCountry(user.getCountry());
		bean.setId(user.getId());
		bean.setMobileNo(user.getMobileNo());
		return bean;
	}

	private User prepareModel(UserBean userBean) {
		User user = new User();
		user.setId(userBean.getId());
		user.setLogin(userBean.getLogin());
		user.setPassword(userBean.getPassword());
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setCountry(userBean.getCountry());
		user.setEmailId(userBean.getEmailId());
		user.setMobileNo(userBean.getMobileNo());
		userBean.setId(0);
		return user;
	}

	/**
	 * End of edit
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage() {
		return new ModelAndView("admin-second");
	}

}
