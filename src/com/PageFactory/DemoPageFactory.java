package com.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoPageFactory {

	// IE driver
	public static final String driver_path_IE = "./Drivers/IEDriverServer.exe";
	public static final String driver_value_IE = "webdriver.ie.driver";
	public static final String browser_name_IE = "IE";

	// Chrome driver
	public static final String driver_path_chrome = "./Drivers/chromedriver.exe";
	public static final String driver_value_chrome = "webdriver.chrome.driver";
	public static final String browser_name_chrome = "chrome";
	// Login Information
	public static final String url = "http://newtours.demoaut.com/";
	public static final String username = "demo";
	public static final String password = "demo";

	// Web Elements of Login Page

	@FindBy(how = How.NAME, using = "userName")

	public WebElement userNameInput;
	
	@FindBy(how = How.NAME, using = "password")

	public WebElement passwordInput;
	
	@FindBy(how = How.NAME, using = "login")

	public WebElement submitButton;
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'SIGN-OFF')]")

	public WebElement signOffButton;

}
