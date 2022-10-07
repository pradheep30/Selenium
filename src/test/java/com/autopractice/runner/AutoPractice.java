package com.autopractice.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\com\\autopractice\\feature", glue = "com.autopractice.stepdef",
	monochrome = true,
	//tags = "@smoketest",
	plugin = {"pretty", "html:Report/Cucumber_Report", "json:Report/Cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtendReport.html"} //dryRun = true 
	)

	public class AutoPractice {

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


