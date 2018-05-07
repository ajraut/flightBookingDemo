package com.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static String captureScreenShot(WebDriver driver,
			String screenShotName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = ".\\Screenshots\\" + screenShotName + ".png";

		try {

			FileUtils.copyFile(src, new File(path));

		} catch (Exception e) {

			e.printStackTrace();
		}

		return path;
	}

}
