package com.testNG.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.com.BaseClass;

public class CrossBrowser extends BaseClass {
	
	@Parameters({"browser"})
	@BeforeClass
	public void browserLaun(String browser) {

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();  

		}
		else
		{
			System.out.println("Invalid browser is selected");
		}

}   	
	@Parameters({"emailId", "password"})
	@Test
	public void launch(String email,String pass) {
		System.out.println(email + " " + pass );
		launchUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
}
