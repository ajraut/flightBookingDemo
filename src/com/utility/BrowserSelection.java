package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.PageFactory.DemoPageFactory;

public class BrowserSelection {

	WebDriver driver;
	ConfigReader conf = new ConfigReader();

	public WebDriver browserSelection(String browser) {

		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty(DemoPageFactory.driver_value_IE, DemoPageFactory.driver_path_IE);
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty(DemoPageFactory.driver_value_chrome, DemoPageFactory.driver_path_chrome);
			driver = new ChromeDriver();
		}

		return driver;

	}

}
