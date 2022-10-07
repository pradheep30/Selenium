package com.adac.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjManager.com.Page_Obj_Man;
import com.adac.runner.AdacRunner;
import com.base.com.BaseClass;
import com.reader.com.FileReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	WebDriver driver = AdacRunner.driver;
	Page_Obj_Man pom = new Page_Obj_Man(driver);

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
		launchUrl("http://adactinhotelapp.com/");
	}
	
	@When("^user Enter The \"([^\"]*)\" username In The InputBox$")
	public void user_Enter_The_username_In_The_InputBox(String username) throws Throwable {
		sendValues(pom.getLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" Password In The InputBox$")
	public void user_Enter_The_Password_In_The_InputBox(String password) throws Throwable {
		sendValues(pom.getLogin().getPassword(), password);
	}

	@Then("^User Clicks On The LoginPage And It Navigates In To Search Page$")
	public void user_Clicks_On_The_LoginPage_And_It_Navigates_In_To_Search_Page()  {
		clickonElement(pom.getLogin().getLogin());
	}


}
