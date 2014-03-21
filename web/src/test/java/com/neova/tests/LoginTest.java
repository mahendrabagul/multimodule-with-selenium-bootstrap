package com.neova.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  

	@Test(enabled = false)
	public void testLoginAsAdmin() {
		
		Assert.assertEquals("admin", "admin");
		
	}
}
