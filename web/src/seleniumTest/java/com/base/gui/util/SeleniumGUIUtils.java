package com.base.gui.util;

import com.thoughtworks.selenium.Selenium;

public class SeleniumGUIUtils implements Selenium {

	private Selenium ivOrg;

    private long ivDefaultTimeoutMillis=180*1000;

    private boolean ivWaitForInJava=false;

    public SeleniumGUIUtils(Selenium org)
    {
        ivOrg=org;
    }

    public Selenium getOrg()
    {
        return ivOrg;
    }

    public void setWaitForInJava(boolean val)
    {
        ivWaitForInJava=val;
    }

    public boolean getWaitForInJava()
    {
        return ivWaitForInJava;
    }

    public long getDefaultTimeoutMillis()
    {
        return ivDefaultTimeoutMillis;
    }

    public int getDefaultTimeoutSeconds()
    {
        return (int) (getDefaultTimeoutMillis()/1000);
    }

    public void setDefaultTimeoutMillis(long val)
    {
        ivDefaultTimeoutMillis=val;
    }

    public void setDefaultTimeoutSeconds(long val)
    {
    	setDefaultTimeoutMillis(val*1000);
    }

     public  void waitForElement( String locator)
     {
         waitForElement(locator,getDefaultTimeoutSeconds());
     }

    public void waitForElement(String locator, int timeOutSeconds)
    {
        if(ivWaitForInJava)
        {
            System.out.println("Waiting in Java");
            long startTime = System.currentTimeMillis();
            long timeoutMillis=timeOutSeconds*1000;

            while (System.currentTimeMillis()-startTime<timeoutMillis)
            {
                if (this.isElementPresent(locator))
                {
                    return;
                }
                SeleniumWebUtils.pause(500);
            }
        }
        else
        {
            String cleanLocator = locator.replace('\"','\'');
            System.out.println("Waiting for "+cleanLocator);
            String script = "selenium.isElementPresent(\"" + cleanLocator + "\");";
            //System.out.println("WaitForEl Script:"+ script);
            waitForCondition(script, "" + (timeOutSeconds * 1000));
        }
    }

    public void start()
    {
        ivOrg.start();
    }

    public void stop()
    {
        ivOrg.stop();
    }

    public void click(String s)
    {
        waitForElement(s);
        ivOrg.click(s);
    }

    public void doubleClick(String s)
    {
        waitForElement(s);
        ivOrg.doubleClick(s);
    }

    public void clickAt(String s, String s1)
    {
        waitForElement(s);
        ivOrg.clickAt(s, s1);
    }

    public void doubleClickAt(String s, String s1)
    {
        waitForElement(s);
        ivOrg.doubleClickAt(s, s1);
    }

    public void fireEvent(String s, String s1)
    {
        waitForElement(s);
        ivOrg.fireEvent(s, s1);
    }

    public void keyPress(String s, String s1)
    {
        waitForElement(s);
        ivOrg.keyPress(s, s1);
    }

    public void shiftKeyDown()
    {
        ivOrg.shiftKeyDown();
    }

    public void shiftKeyUp()
    {
        ivOrg.shiftKeyUp();
    }

    public void metaKeyDown()
    {
        ivOrg.metaKeyDown();
    }

    public void metaKeyUp()
    {
        ivOrg.metaKeyUp();
    }

    public void altKeyDown()
    {
        ivOrg.altKeyDown();
    }

    public void altKeyUp()
    {
        ivOrg.altKeyUp();
    }

    public void controlKeyDown()
    {
        ivOrg.controlKeyDown();
    }

    public void controlKeyUp()
    {
        ivOrg.controlKeyUp();
    }

    public void keyDown(String s, String s1)
    {
        waitForElement(s);
        ivOrg.keyDown(s, s1);
    }

    public void keyUp(String s, String s1)
    {
        waitForElement(s);
        ivOrg.keyUp(s, s1);
    }

    public void mouseOver(String s)
    {
        ivOrg.mouseOver(s);
    }

    public void mouseOut(String s)
    {
        ivOrg.mouseOut(s);
    }

    public void mouseDown(String s)
    {
        ivOrg.mouseDown(s);
    }

    public void mouseDownAt(String s, String s1)
    {
        ivOrg.mouseDownAt(s, s1);
    }

    public void mouseUp(String s)
    {
        ivOrg.mouseUp(s);
    }

    public void mouseUpAt(String s, String s1)
    {
        ivOrg.mouseUpAt(s, s1);
    }

    public void mouseMove(String s)
    {
        ivOrg.mouseMove(s);
    }

    public void mouseMoveAt(String s, String s1)
    {
        ivOrg.mouseMoveAt(s, s1);
    }

    public void type(String s, String s1)
    {
        waitForElement(s);
        ivOrg.type(s, s1);
    }

    public void setSpeed(String s)
    {
        ivOrg.setSpeed(s);
    }

    public String getSpeed()
    {
        return ivOrg.getSpeed();
    }

    public void check(String s)
    {
        waitForElement(s);
        ivOrg.check(s);
    }

    public void uncheck(String s)
    {
        waitForElement(s);
        ivOrg.uncheck(s);
    }

    public void select(String s, String s1)
    {
        waitForElement(s);
        ivOrg.select(s, s1);
    }

    public void addSelection(String s, String s1)
    {
        waitForElement(s);
        ivOrg.addSelection(s, s1);
    }

    public void removeSelection(String s, String s1)
    {
        waitForElement(s);
        ivOrg.removeSelection(s, s1);
    }

    public void submit(String s)
    {
        waitForElement(s);
        ivOrg.submit(s);
    }

    public void open(String s)
    {
        ivOrg.open(s);
    }

    public void openWindow(String s, String s1)
    {
        ivOrg.openWindow(s, s1);
    }

    public void selectWindow(String s)
    {
        ivOrg.selectWindow(s);
    }

    public void selectFrame(String s)
    {
        ivOrg.selectFrame(s);
    }

    public boolean getWhetherThisFrameMatchFrameExpression(String s, String s1)
    {
        return ivOrg.getWhetherThisFrameMatchFrameExpression(s, s1);
    }

    public boolean getWhetherThisWindowMatchWindowExpression(String s, String s1)
    {
        return ivOrg.getWhetherThisWindowMatchWindowExpression(s, s1);
    }

    public void waitForPopUp(String s, String s1)
    {
        ivOrg.waitForPopUp(s, s1);
    }

    public void chooseCancelOnNextConfirmation()
    {
        ivOrg.chooseCancelOnNextConfirmation();
    }

    public void answerOnNextPrompt(String s)
    {
        ivOrg.answerOnNextPrompt(s);
    }

    public void goBack()
    {
        ivOrg.goBack();
    }

    public void refresh()
    {
        ivOrg.refresh();
    }

    public void close()
    {
        ivOrg.close();
    }

    public boolean isAlertPresent()
    {
        return ivOrg.isAlertPresent();
    }

    public boolean isPromptPresent()
    {
        return ivOrg.isPromptPresent();
    }

    public boolean isConfirmationPresent()
    {
        return ivOrg.isConfirmationPresent();
    }

    public String getAlert()
    {
        return ivOrg.getAlert();
    }

    public String getConfirmation()
    {
        return ivOrg.getConfirmation();
    }

    public String getPrompt()
    {
        return ivOrg.getPrompt();
    }

    public String getLocation()
    {
        return ivOrg.getLocation();
    }

    public String getTitle()
    {
        return ivOrg.getTitle();
    }

    public String getBodyText()
    {
        return ivOrg.getBodyText();
    }

    public String getValue(String s)
    {
        waitForElement(s);
        return ivOrg.getValue(s);
    }

    public String getText(String s)
    {
        waitForElement(s);
        return ivOrg.getText(s);
    }

    public String getEval(String s)
    {
        return ivOrg.getEval(s);
    }

    public boolean isChecked(String s)
    {
        return ivOrg.isChecked(s);
    }

    public String getTable(String s)
    {
        return ivOrg.getTable(s);
    }

    public String[] getSelectedLabels(String s)
    {
        return ivOrg.getSelectedLabels(s);
    }

    public String getSelectedLabel(String s)
    {
        return ivOrg.getSelectedLabel(s);
    }

    public String[] getSelectedValues(String s)
    {
        return ivOrg.getSelectedValues(s);
    }

    public String getSelectedValue(String s)
    {
        return ivOrg.getSelectedValue(s);
    }

    public String[] getSelectedIndexes(String s)
    {
        return ivOrg.getSelectedIndexes(s);
    }

    public String getSelectedIndex(String s)
    {
        return ivOrg.getSelectedIndex(s);
    }

    public String[] getSelectedIds(String s)
    {
        return ivOrg.getSelectedIds(s);
    }

    public String getSelectedId(String s)
    {
        return ivOrg.getSelectedId(s);
    }

    public boolean isSomethingSelected(String s)
    {
        return ivOrg.isSomethingSelected(s);
    }

    public String[] getSelectOptions(String s)
    {
        return ivOrg.getSelectOptions(s);
    }

    public String getAttribute(String s)
    {
        return ivOrg.getAttribute(s);
    }

    public boolean isTextPresent(String s)
    {
        return ivOrg.isTextPresent(s);
    }

    public boolean isElementPresent(String s)
    {
        return ivOrg.isElementPresent(s);
    }

    public boolean isVisible(String s)
    {
        return ivOrg.isVisible(s);
    }

    public boolean isEditable(String s)
    {
        return ivOrg.isEditable(s);
    }

    public String[] getAllButtons()
    {
        return ivOrg.getAllButtons();
    }

    public String[] getAllLinks()
    {
        return ivOrg.getAllLinks();
    }

    public String[] getAllFields()
    {
        return ivOrg.getAllFields();
    }

    public String[] getAttributeFromAllWindows(String s)
    {
        return ivOrg.getAttributeFromAllWindows(s);
    }

    public void dragdrop(String s, String s1)
    {
        ivOrg.dragdrop(s, s1);
    }

    public void dragAndDrop(String s, String s1)
    {
        ivOrg.dragAndDrop(s, s1);
    }

    public void dragAndDropToObject(String s, String s1)
    {
        ivOrg.dragAndDropToObject(s, s1);
    }

    public String[] getAllWindowIds()
    {
        return ivOrg.getAllWindowIds();
    }

    public String[] getAllWindowNames()
    {
        return ivOrg.getAllWindowNames();
    }

    public String[] getAllWindowTitles()
    {
        return ivOrg.getAllWindowTitles();
    }

    public String getHtmlSource()
    {
        return ivOrg.getHtmlSource();
    }

    public void setCursorPosition(String s, String s1)
    {
        ivOrg.setCursorPosition(s, s1);
    }

    public Number getElementIndex(String s)
    {
        return ivOrg.getElementIndex(s);
    }

    public boolean isOrdered(String s, String s1)
    {
        return ivOrg.isOrdered(s, s1);
    }

    public Number getElementPositionLeft(String s)
    {
        return ivOrg.getElementPositionLeft(s);
    }

    public String getElementScrollLeft(String id) {
    	return ivOrg.getEval("window.document.getElementById(\"" + id + "\").scrollLeft");
    }

    public Number getElementPositionTop(String s)
    {
        return ivOrg.getElementPositionTop(s);
    }

    public Number getElementWidth(String s)
    {
        return ivOrg.getElementWidth(s);
    }

    public Number getElementHeight(String s)
    {
        return ivOrg.getElementHeight(s);
    }

    public Number getCursorPosition(String s)
    {
        return ivOrg.getCursorPosition(s);
    }

    public void setContext(String s)
    {
        ivOrg.setContext(s);
    }

    public String getExpression(String s)
    {
        return ivOrg.getExpression(s);
    }

    public void waitForCondition(String s, String s1)
    {
        ivOrg.waitForCondition(s, s1);
    }

    public void setTimeout(String s)
    {
        ivOrg.setTimeout(s);
    }

    public void waitForPageToLoad(String s)
    {
        ivOrg.waitForPageToLoad(s);
    }

    public void waitForPageToLoad()
    {
        ivOrg.waitForPageToLoad(""+this.ivDefaultTimeoutMillis);
    }

    public String getCookie()
    {
        return ivOrg.getCookie();
    }

    public void createCookie(String s, String s1)
    {
        ivOrg.createCookie(s, s1);
    }

    public void deleteCookie(String s, String s1)
    {
        ivOrg.deleteCookie(s, s1);
    }

	public void addLocationStrategy(String arg0, String arg1)
	{
		ivOrg.addLocationStrategy(arg0, arg1);

	}

	public void allowNativeXpath(String arg0)
	{
		ivOrg.allowNativeXpath(arg0);

	}

	public void assignId(String arg0, String arg1)
	{
		ivOrg.assignId(arg0, arg1);

	}

	public void captureScreenshot(String arg0)
	{
		ivOrg.captureScreenshot(arg0);

	}

	public void chooseOkOnNextConfirmation()
	{
		ivOrg.chooseOkOnNextConfirmation();

	}

	public Number getMouseSpeed()
	{
		return ivOrg.getMouseSpeed();
	}

	public Number getXpathCount(String arg0)
	{
		return ivOrg.getXpathCount(arg0);
	}

	public void highlight(String arg0)
	{
		ivOrg.highlight(arg0);
	}

	public void removeAllSelections(String arg0)
	{
		ivOrg.removeAllSelections(arg0);
	}

	public void runScript(String arg0)
	{
		ivOrg.runScript(arg0);
	}

	public void setBrowserLogLevel(String arg0)
	{
		ivOrg.setBrowserLogLevel(arg0);
	}

	public void setMouseSpeed(String arg0)
	{
		ivOrg.setMouseSpeed(arg0);
	}

	public void typeKeys(String arg0, String arg1)
	{
		ivOrg.typeKeys(arg0, arg1);
	}

	public void waitForFrameToLoad(String arg0, String arg1)
	{
		ivOrg.waitForFrameToLoad(arg0, arg1);
	}

	public void windowFocus()
	{
		ivOrg.windowFocus();
	}

	public void windowMaximize()
	{
		ivOrg.windowMaximize();
	}


	public void addCustomRequestHeader(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public void addScript(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public void attachFile(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public void captureEntirePageScreenshot(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public String captureEntirePageScreenshotToString(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public String captureNetworkTraffic(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public String captureScreenshotToString() {
		// TODO Auto-generated method stub
		return null;
	}


	public void contextMenu(String arg0) {
		// TODO Auto-generated method stub

	}


	public void contextMenuAt(String arg0, String arg1) {
		
		waitForElement(arg0);
		ivOrg.contextMenuAt(arg0, arg1);
		// TODO Auto-generated method stub

	}


	public void deleteAllVisibleCookies() {
		// TODO Auto-generated method stub

	}


	public void deselectPopUp() {
		// TODO Auto-generated method stub

	}


	public void focus(String arg0) {
		// TODO Auto-generated method stub

	}


	public String getCookieByName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public void ignoreAttributesWithoutValue(String arg0) {
		// TODO Auto-generated method stub

	}


	public boolean isCookiePresent(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	public void keyDownNative(String arg0) {
		// TODO Auto-generated method stub

	}


	public void keyPressNative(String arg0) {
		// TODO Auto-generated method stub

	}


	public void keyUpNative(String arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseDownRight(String arg0) {
		
		waitForElement(arg0);
		ivOrg.mouseDownRight(arg0);
		// TODO Auto-generated method stub

	}


	public void mouseDownRightAt(String arg0, String arg1) {
		
		waitForElement(arg0);
		ivOrg.mouseDownRightAt(arg0, arg1);
		// TODO Auto-generated method stub

	}


	public void mouseUpRight(String arg0) {
		
		waitForElement(arg0);
		ivOrg.mouseUpRight(arg0);
		// TODO Auto-generated method stub

	}


	public void mouseUpRightAt(String arg0, String arg1) {
		
		waitForElement(arg0);
		ivOrg.mouseUpRightAt(arg0, arg1);
		// TODO Auto-generated method stub

	}


	public void removeScript(String arg0) {
		// TODO Auto-generated method stub

	}


	public String retrieveLastRemoteControlLogs() {
		// TODO Auto-generated method stub
		return null;
	}


	public void rollup(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public void selectPopUp(String arg0) {
		// TODO Auto-generated method stub

	}


	public void setExtensionJs(String arg0) {
		// TODO Auto-generated method stub

	}


	public void showContextualBanner() {
		// TODO Auto-generated method stub

	}


	public void showContextualBanner(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}


	public void shutDownSeleniumServer() {
		// TODO Auto-generated method stub

	}


	public void start(String arg0) {
		// TODO Auto-generated method stub

	}


	public void start(Object arg0) {
		// TODO Auto-generated method stub

	}


	public void useXpathLibrary(String arg0) {
		// TODO Auto-generated method stub

	}

	public String getLog() {
		// TODO Auto-generated method stub
		return null;
	}

	public void open(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Number getCssCount(String css)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
