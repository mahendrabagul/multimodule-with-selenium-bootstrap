/**
 * 
 * User.java
 * 
 * Version:
 * 		1.0
 * 
 * Revisions:
 * 		
 *
 */

package com.neova.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This is model class for User
 * 
 * 
 * @author Mahendra Bagul
 * 
 *         Neova Solutions Pvt. Ltd.
 * 
 */

@Entity
@Table(name = "users")
public class User {

	private String country;

	private String emailId;

	private String firstName;
	private String lastName;
	private String mobileNo;

	@Id
	@GeneratedValue
	private Integer id;

	private String login;

	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_roles", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") })
	private Role role;

	public String getCountry() {
		return country;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public Integer getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLogin() {
		return login;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		return role;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public String toString() {
		return "User Details :"+"\nFirst Name:\t"+getFirstName()
				+ "\nLast Name:\t"+getLastName()
				+"\nEmail Id:\t"+getEmailId()
				+"\nCountry:\t"+getCountry()
				+"\nMobile No:\t"+getMobileNo()
				+"\nUser Name:\t"+getLogin()
				+"\nPassword:\t"+getPassword()				
				;
		
		
	}

}
