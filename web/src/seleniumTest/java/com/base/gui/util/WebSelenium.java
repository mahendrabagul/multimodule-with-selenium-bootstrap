package com.base.gui.util;

import org.testng.Assert;

import com.thoughtworks.selenium.Selenium;

public class WebSelenium extends SeleniumTestCase {

	private WebBasicXPathsProvider wbx = new WebBasicXPathsProvider();
	
	/**
	 * Constructors
	 * WebSelenium()
	 * WebSelenium(String name).
	 */
	public WebSelenium() {
		super();
	}
	public WebSelenium(String name) {
		super(name);
	}

	public void loginAsAdmin()
	{
		doLogin(Users.ADMIN);
	}

	public void loginAsUser()
	{
		doLogin(Users.USER);
	}
	
	public void login(String user, String password) {

		enterLoginUserAndPassword(user, password);
		clickSignInButton();
	}

	public void doLogin(Users user)
	{
		doLogin(user.getUsername(), user.getPassword());
	}

	public void doLogin(String user, String password) {
		login(user, password);
		getSel().waitForElement(wbx.getLogOutbuttonXPath());
		confirmLogin();
	}
	
	protected void clickSignInButton() {
		getSel().click(wbx.getSignInButtonXPath());
	}

	public void confirmLogin()
	{
		Assert.assertTrue(getSel().isElementPresent(wbx.getLogOutbuttonXPath()));
	}

	public void enterLoginUserAndPassword(Users user)
	{
		enterLoginUserAndPassword(user.getUsername(), user.getPassword());
	}

	public void enterLoginUserAndPassword(String user, String password)
	{
		getSel().click(wbx.getModerationPageXPath());
		getSel().type(wbx.getUsernameXPath(), user);
		getSel().type(wbx.getPasswordXPath(), password);
	}

	protected void waitForGUI() {
		SeleniumWebUtils.pauseSeconds(5);
	}
	
	protected void waitForGUI(int sec) {
		SeleniumWebUtils.pauseSeconds(sec);
	}

	public void logout()
	{
		getSel().click(wbx.getLogOutbuttonXPath());
		getSel().waitForElement(wbx.getModerationPageXPath());
	}

	/**
	 * getAppURL() gets welcome page URL.
	 */
	@Override
	protected final String getAppURL() {
            return getContextURL()+"/";
	}

	/**
	 * getTomcatHost() gets tomcat host name from the system variables.
	 * @return
	 */
	private String getTomcatHost() {
		return SeleniumWebUtils.getStringProperty("tomcat.host", "localhost");
	}
	/**
	 * getTomcatPort() gets tomcat port number from the system variables.
	 * @return
	 */
	private String getTomcatPort() {
		return SeleniumWebUtils.getStringProperty("tomcat.port", "8080");
	}
	/**
	 * getContextURL() gets application context URL
	 * @return
	 */
	public String getContextURL()
	{
		return"http://"+getTomcatHost()+":"+getTomcatPort() + "/"+getTomcatBaseURL();
	}

	private String getTomcatBaseURL() {
		return SeleniumWebUtils.getStringProperty("tomcat.baseurl", "web");
	}

    @Override
	protected Selenium makeSelenium(String url)
	{
		return SeleniumWebUtils.startSelenium(url);
	}
}
