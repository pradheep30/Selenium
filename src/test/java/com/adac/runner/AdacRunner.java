package com.adac.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adac\\feature", glue = "com.adac.stepdef",
monochrome = true,
tags = {"@smoketest"},
plugin = {"pretty", "html:Report/Cucumber_Report1", "json:Report/Cucumber1.json", 
"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtendReport1.html"} //dryRun = true 
) //dryRun = true 

public class AdacRunner {
	
	public static WebDriver driver;
	
    @BeforeClass
	public static void setUp() {
		driver = BaseClass.browserLaunch("chrome");
		
	}
	@AfterClass
	public static void closeBrowser() {   
		BaseClass.close();
		
	}


}
