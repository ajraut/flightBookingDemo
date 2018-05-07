package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageFactory.DemoPageFactory;
import com.utility.ConfigReader;

public class LoginPage {
	
	WebDriver driver;
	ConfigReader conf = new ConfigReader();
	DemoPageFactory pf = new DemoPageFactory();

	public LoginPage(WebDriver driver) // constructor
	{
		this.driver = driver;
	}
	
	public void openBrowser() {
		driver.manage().window().maximize();
		driver.get(DemoPageFactory.url);
		
	}

	public WebElement getElement(String str) {
		WebElement element = driver.findElement(By.xpath(str));
		return element;
	}
		
	public List<WebElement> getElements(String str) {
		List<WebElement> elements = driver.findElements(By.xpath(str));
		return elements;
	}

}
