package com.web.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.gui.util.WebBasicXPathsProvider;
import com.base.gui.util.WebSelenium;

public class LoginGUITest extends WebSelenium {

	private WebBasicXPathsProvider xpath = new WebBasicXPathsProvider();
	
	@Test
	public void testAdminLogin() {
		
		try {
			loginAsAdmin();
		}
		finally
		{
			logout();
		}
	}
	
	@Test
	public void testUserLoginAndAccess() {
		try {
			loginAsUser();
			getSel().click(xpath.getHomeLinkXPath());
			getSel().click(xpath.getFirstAdminPageXPath());
			getSel().waitForElement(xpath.getLogOutbuttonXPath());
			Assert.assertTrue(getSel().isTextPresent("You do not have access to this Page"));
		}
		finally
		{
			logout();
		}
	}
	
}
