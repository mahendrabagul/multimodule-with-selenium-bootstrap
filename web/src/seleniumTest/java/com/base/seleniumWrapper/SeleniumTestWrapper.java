package com.base.seleniumWrapper;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumTestWrapper {

	private DefaultSelenium ds;
	
	public void openLoginPage()
	{
		ds = new DefaultSelenium("localhost",4444,"*firefox","http://localhost:8080");
		ds.start();
		ds.open("/");
		ds.open("http://localhost:8080/web/");
	}
	
	public void loginAsAdmin()
	{
		
	}
	
	public DefaultSelenium getDs() {
		return ds;
	}
	
	public DefaultSelenium getSelenium() {
		return ds;
	}
}
