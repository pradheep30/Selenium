package com.testNG.com;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.com.BaseClass;

public class Data_Provider extends BaseClass{

	@Test(dataProvider = "login")
	public void launch(String email,String pass) {
		System.out.println(email + " " + pass );
		browserLaunch("firefox");
		launchUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		}
	@DataProvider(name = "login",indices = {1, 2})//indices = {2} - select particular email and password
	public Object[][] testdata() {
		{
			return new Object[][]{
				
				{"abc123","13254"},{"abc546","65489"},{"abc98756","54789"}
			};}
	}
}



