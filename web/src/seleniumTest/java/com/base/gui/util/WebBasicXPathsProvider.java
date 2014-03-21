package com.base.gui.util;

public class WebBasicXPathsProvider {
	
	public String getUsernameXPath()
	{
		return "//input[@id='j_username']";
	}

	public String getPasswordXPath()
	{
		return "//*[@id='j_password']";
	}
	
	public String getSignInButtonXPath()
	{
		return "//*[@id='a-submit']";
	}
	
	public String getLogOutbuttonXPath()
	{
		return "//*[@id='a-logout-button']";
	}
	
	public String getModerationPageXPath()
	{
		return "//*[@id='a-moderation-page']";
	}
	
	public String getFirstAdminPageXPath()
	{
		return "//*[@id='a-admin-first-page']";
	}
	
	public String getSecondAdminPageXPath()
	{
		return "//*[@id='a-admin-second-page']";
	}
	
	public String getHomeLinkXPath()
	{
		return "//*[@id='a-home']";
	}
	
}
