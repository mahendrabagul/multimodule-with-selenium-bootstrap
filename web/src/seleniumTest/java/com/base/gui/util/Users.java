package com.base.gui.util;

public enum Users
{
	ADMIN("admin"),
	USER("user");
	
	String username;
	String password;
	
	Users(String user)
	{
		this.username = user;
		this.password = user;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
}
