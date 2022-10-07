package com.facebookrunner.com;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklaunch {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			TakesScreenshot ts=(TakesScreenshot)driver;
			File str = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Screenshots\\scr1.png");
			FileUtils.copyFile(str, dest); 
			System.out.println("success");


	}

}
