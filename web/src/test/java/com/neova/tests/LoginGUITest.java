package com.neova.tests;

import org.testng.annotations.Test;

import com.base.seleniumWrapper.SeleniumTestWrapper;

public class LoginGUITest extends SeleniumTestWrapper {

	@Test
	public void testDemo() {
		
		openLoginPage();
	}
}
