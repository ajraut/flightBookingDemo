package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageFactory.DemoPageFactory;
import com.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.BrowserSelection;
import com.utility.ConfigReader;
import com.utility.TakeScreenshot;

public class LoginTest {

	static WebDriver driver;
	LoginPage lPage;
	ExtentReports rpt;
	ExtentTest logger;
	WebDriverWait wait;
	BrowserSelection browserSelect = new BrowserSelection();
	ConfigReader conf = new ConfigReader();
	DemoPageFactory pf = new DemoPageFactory();
	String passwd;

	@Parameters({ "browser" })
	@BeforeTest
	public void initiateBrowser(@Optional("Chrome") String browser) {

		driver = browserSelect.browserSelection(browser);

		lPage = new LoginPage(driver);
		pf = PageFactory.initElements(driver, DemoPageFactory.class);

		rpt = new ExtentReports("./TestReport.html", true);
		rpt.loadConfig(LoginTest.class, "resources", "config.xml");
		lPage.openBrowser();

	}

	@Test
	public void testLogin() throws InterruptedException {

		logger = rpt.startTest("Login Test", "Providing Credetials For Login").assignCategory("Functional");
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(pf.userNameInput));

		pf.userNameInput.sendKeys(DemoPageFactory.username);
		logger.log(LogStatus.INFO, "UserName Entered");
		pf.passwordInput.sendKeys(DemoPageFactory.password);
		logger.log(LogStatus.INFO, "Password Entered");
		pf.submitButton.click();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");

		new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(pf.signOffButton));

		if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			logger.log(LogStatus.PASS, "Login Successful And HomePage Appeared!");
		} else {
			logger.log(LogStatus.FAIL, "Provide Valid Credentials");
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
		}

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "ScreenShot: "
					+ logger.addScreenCapture(TakeScreenshot.captureScreenShot(driver, result.getName())));
		} else {
			logger.log(LogStatus.ERROR, "Dependant test caese(s) will be skipped if any..! ");
			logger.log(LogStatus.FAIL, "ScreenShot: "
					+ logger.addScreenCapture(TakeScreenshot.captureScreenShot(driver, result.getName())));
		}
		rpt.endTest(logger);
		rpt.flush();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
		rpt.close();
	}

}
