package com.testNG.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.com.BaseClass;

public class Parameter extends BaseClass{
	
	@Parameters({"emailId", "password"})
	@Test
	public void launch(String email,String pass) {
		    System.out.println(email + " " + pass );
		    browserLaunch("firefox");
			launchUrl("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("email")).sendKeys(email);
	        driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

}
