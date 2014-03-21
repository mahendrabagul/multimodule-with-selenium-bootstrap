package com.base.gui.util;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.thoughtworks.selenium.Selenium;

import junit.framework.TestCase;

public abstract class SeleniumTestCase extends TestCase {

	private int ivDefaultTimeout=20;
    
    private SeleniumGUIUtils ivSel;
    private boolean ivCloseOnFinish=true;

    public SeleniumTestCase()
    {
    	super();
    }
    
    public SeleniumTestCase(String name)
    {
    	super(name);
    }

    /** Default timeout in seconds*/
    public int getDefaultTimeout()
    {
        return ivDefaultTimeout;
    }

    /** Default timeout in seconds*/
    public void setDefaultTimeout(int val)
    {
        ivDefaultTimeout=val;
    }
    @BeforeMethod
    public void setUp()
    {
        ivDefaultTimeout=SeleniumWebUtils.getIntProperty("default.timeout",100);
        String url = getLoginURL();
        ivSel = SeleniumWebUtils.newSelenium(makeSelenium(url));
        ivSel.open(url);
    }

    protected String getLoginURL()
    {
        return getAppURL();
    }

    protected abstract String getAppURL();
    
    protected abstract Selenium makeSelenium(String url);

    public void setCloseOnEnd(boolean val)
    {
        ivCloseOnFinish = val;
    }

    public boolean getCloseOnEnd()
    {
        return ivCloseOnFinish;
    }
    
    @AfterMethod
    public void tearDown()
    {
    	if(ivCloseOnFinish)
        {
        	ivSel.stop();
        }
    }
    
    public SeleniumGUIUtils getSel()
    {
        return ivSel;
    }
	
}
