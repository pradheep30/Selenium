package com.autopractice.stepdef;

import org.openqa.selenium.WebDriver;

import com.PageObjManagerwithAP.com.PageObjManWithAP;
import com.autopractice.runner.AutoPractice;
import com.base.com.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutoPractice_stepdef extends BaseClass {
	
	WebDriver driver = AutoPractice.driver;
	PageObjManWithAP POM = new PageObjManWithAP(driver);

	
	@Given("^user Launch The Automation Practice Application$")
	public void user_Launch_The_Automation_Practice_Application() throws Throwable {
		
		launchUrl("http://automationpractice.com/index.php");
	}

	@When("^user Clicks The Login Button$")
	public void user_Clicks_The_Login_Button() throws Throwable {
		
		clickonElement(POM.getSign().getLogin());
	}

	@Then("^it Navigates InTo Authetication Page$")
	public void it_Navigates_InTo_Authetication_Page() throws Throwable {
		
		System.out.println("Authetication Page Opened");
		
	}

	@When("^user Enters The Email Id In The InputBox$")
	public void user_Enters_The_Email_Id_In_The_InputBox() throws Throwable {
		
		POM.getAuthen().getEmail().sendKeys("abc987654331@gmail.com");
	}
	
	@When("^user Clicks The Create Login Button$")
	public void user_Clicks_The_Create_Login_Button() throws Throwable {
		
		clickonElement(POM.getAuthen().getSubmit());
	}
	
	@Then("^it Then it Navigates InTo Create Account Page$")
	public void it_Then_it_Navigates_InTo_Create_Account_Page() throws Throwable {
		
		System.out.println("Account Page Opened");
		implicitWait(30);
	}


	@When("^user Clicks The Gender In The Radio Button$")
	public void user_Clicks_The_Gender_In_The_Radio_Button() throws Throwable {
		
		clickonElement(POM.getCreate().getGender());
	
	}

	@When("^user Enters The FirstName In The InputBox$")
	public void user_Enters_The_FirstName_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getFirstname().sendKeys("pradheep");
	}

	@When("^user Enters The LastName In The InputBox$")
	public void user_Enters_The_LastName_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getLastname1().sendKeys("kumar");
	}

	@When("^user Enters The Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getPassword().sendKeys("123456");
	}

	@When("^user Selects The Day In The DropDown Box$")
	public void user_Selects_The_Day_In_The_DropDown_Box() throws Throwable {
		
		dropDown(POM.getCreate().getDay(), "value", "13");
	}

	@When("^user Selects The Month In The DropDown Box$")
	public void user_Selects_The_Month_In_The_DropDown_Box() throws Throwable {
		
		dropDown(POM.getCreate().getMonth1(), "value", "5");
	}

	@When("^user Selects The Year In The DropDown Box$")
	public void user_Selects_The_Year_In_The_DropDown_Box() throws Throwable {
		
		dropDown(POM.getCreate().getYear(), "value", "2018");
	}

	@When("^user Clicks The News Button$")
	public void user_Clicks_The_News_Button() throws Throwable {
		
		clickonElement(POM.getCreate().getNews1());
	}

	@When("^user Clicks The Options Button$")
	public void user_Clicks_The_Options_Button() throws Throwable {
		
		clickonElement(POM.getCreate().getOptions1());
	}

	@When("^user Enters The Company Name In The InputBox$")
	public void user_Enters_The_Company_Name_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getComp().sendKeys("abc company");
	}

	@When("^user Enters The Address(\\d+) In The InputBox$")
	public void user_Enters_The_Address_In_The_InputBox(int arg1) throws Throwable {
		
		POM.getCreate().getAddr1().sendKeys("abc street,california,usa");
	}
	
	@When("^user Enters The Addr(\\d+) In The InputBox$")
	public void user_Enters_The_Addr_In_The_InputBox(int arg1) throws Throwable {
		
		POM.getCreate().getAddr2().sendKeys("d block");
	}

	@When("^user Enters The City In The InputBox$")
	public void user_Enters_The_City_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getCity1().sendKeys("madurai");
		
	}

	@When("^user Enters The State In The InputBox$")
	public void user_Enters_The_State_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getState().sendKeys("tn");
	}

	@When("^user Enters The Postal Code In The InputBox$")
	public void user_Enters_The_Postal_Code_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getPostal().sendKeys("25123");
	}

	@When("^user Enters The Phone Number In The InputBox$")
	public void user_Enters_The_Phone_Number_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getPh().sendKeys("65456845");
	}

	@When("^user Enters The Mobile Number In The InputBox$")
	public void user_Enters_The_Mobile_Number_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getMob().sendKeys("2658456");
	}

	@When("^user Enters The Alias In The InputBox$")
	public void user_Enters_The_Alias_In_The_InputBox() throws Throwable {
		
		POM.getCreate().getAlia().sendKeys("ebebebeb");
	}

	@When("^user Clicks The Submit Btn$")
	public void user_Clicks_The_Submit_Btn() throws Throwable {
		
		clickonElement(POM.getCreate().getSubmitacc());
	}

	@Then("^It Navigates InTo LogOut Page$")
	public void it_Navigates_InTo_LogOut_Page() throws Throwable {
		
		System.out.println("LogOut Page Opened");
	}

	@When("^user Clicks The LogOut Btn$")
	public void user_Clicks_The_LogOut_Btn() throws Throwable {
		
		clickonElement(POM.getLogin().getLogout());
	}

	@When("^Then It Navigates InTo LogIn Page$")
	public void then_It_Navigates_InTo_LogIn_Page() throws Throwable {
		
		System.out.println("Re-LogIn Page Opened");

	}

	@When("^user Enters The User In The InputBox$")
	public void user_Enters_The_UserName_In_The_InputBox() throws Throwable {
		
		POM.getLogin().getMail().sendKeys("abc987654331@gmail.com");
	}
	
	@When("^user Enters The Pwd In The InputBox$")
	public void user_Enters_The_Pwd_In_The_InputBox() throws Throwable {
		
		POM.getLogin().getPass().sendKeys("123456");
	}

	@When("^user Clicks The Log Btn$")
	public void user_Clicks_The_Log_Btn() throws Throwable {
		
		clickonElement(POM.getLogin().getSublog());
    }

	@Then("^It Navigates InTo Menu Page$")
	public void it_Navigates_InTo_Menu_Page() throws Throwable {
		
		System.out.println("Menu Page Opened");
	}

	@When("^user Clicks The TShirt button$")
	public void user_Clicks_The_TShirt_button() throws Throwable {
		
		clickonElement(POM.getCart().getTshirt());
		implicitWait(30);
	}

	@When("^user Clicks The Image Button$")
	public void user_Clicks_The_Image_Button() throws Throwable {
		
		clickonElement(POM.getCart().getImg());
		implicitWait(30);
	}

	@When("^user Double Clicks The Pass Btn$")
	public void user_Double_Clicks_The_Pass_Btn() throws Throwable {
		
		framesbyIdex(0);
		doubleclick(POM.getCart().getPass());
	}

	@When("^user Clicks The Group Button$")
	public void user_Clicks_The_Group_Button() throws Throwable {
		
		clickonElement(POM.getCart().getGroup());
	}

	@When("^user Clicks The Colour Button$")
	public void user_Clicks_The_Colour_Button() throws Throwable {
		
		clickonElement(POM.getCart().getColor());
	}

	@When("^user Clicks The Exclusive Button$")
	public void user_Clicks_The_Exclusive_Button() throws Throwable {
		
		clickonElement(POM.getCart().getExclus());
	}

	@Then("^it Navigates InTo The CheckOut Page$")
	public void it_Navigates_InTo_The_CheckOut_Page() throws Throwable {
		
		System.out.println("CheckOut Page");
	}

}
