package com.base.gui.util;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeleniumWebUtils {
	
	public static final String SYSTEM_SELENIUM_LAUNCHER = "selenium.launcher";
	public static final String SYSTEM_SELENIUM_PORT = "selenium.port";
	public static final String SYSTEM_SELENIUM_HOST = "selenium.host";
	private static boolean ivDebug=false;
	private static int ivDefaultTimeoutSeconds =360;
	private static final Object foo = new Object();	
	
	public static void setDefaultTimeoutSeconds(int val)
	{
		ivDefaultTimeoutSeconds=val;
	}

	public static Selenium startSelenium(String url)
	{
		synchronized (foo)
		{
			DefaultSelenium def=new DefaultSelenium(getSeleniumHost(), getSeleniumPort(), getSeleniumLauncher(), url);
			def.start();
			return def;
		}
	}
	
	public static synchronized SeleniumGUIUtils newSelenium(Selenium def)
	{
		SeleniumGUIUtils sel= new SeleniumGUIUtils(def);
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e)
		{
			//noop
		}
		return sel;
	}
	
	public int getDefaultTimeoutSeconds()
	{
		return ivDefaultTimeoutSeconds;
	}

	public static String getSeleniumLauncher()
	{
		return getStringProperty(SYSTEM_SELENIUM_LAUNCHER, "*firefox");
	}

	public static int getSeleniumPort()
	{
		return getIntProperty(SYSTEM_SELENIUM_PORT, 4444);

	}

	public static String getSeleniumHost()
	{
		return getStringProperty(SYSTEM_SELENIUM_HOST, "localhost");

	}

	public static int getIntProperty(String key, int defaultValue)
	{
		int val = defaultValue;
		String strVal = System.getProperty(key);
		if (strVal != null)
			val = Integer.parseInt(strVal);
		return val;
	}

	public static String getStringProperty(String key, String defaultValue)
	{
		String val = defaultValue;
		String strVal = System.getProperty(key);
		if (strVal != null)
			val = strVal;
		return val;
	}

	public static void waitForPage(Selenium s, int timeoutSeconds)
	{
		s.waitForPageToLoad("" + (timeoutSeconds * 1000));//10 seconds is default timeout.
	}

	public static void waitForPage(Selenium s)
	{
		waitForPage(s, ivDefaultTimeoutSeconds);//10 seconds is default timeout.
	}

	

	public static void waitOnlyForElement(Selenium s, String locator)
	{
		waitOnlyForElement(s,locator,ivDefaultTimeoutSeconds);
	}

	public static void waitOnlyForElement(Selenium s, String locator, int timeOutSeconds)
	{
		if (ivDebug)
			System.out.println("Wait For Element:"+ locator);

		String cleanLocator = locator.replace('\"','\'');
		String script = "selenium.isElementPresent(\"" + cleanLocator + "\");";
		s.waitForCondition(script, "" + (timeOutSeconds * 1000));
	}

	public static void pauseSeconds(long seconds)
	{
		pause(seconds*1000);
	}

	public static void pause(long milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds); 
		}
		catch (Exception e)
		{
			e.printStackTrace(System.out);
		}
	}
}
