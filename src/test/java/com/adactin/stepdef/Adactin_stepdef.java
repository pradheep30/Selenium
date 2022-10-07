package com.adactin.stepdef;

import org.openqa.selenium.WebDriver; 
import com.PageObjManager.com.Page_Obj_Man;
import com.adactin.runner.AdactinRunner;
import com.base.com.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_stepdef extends BaseClass {
	
	WebDriver driver = AdactinRunner.driver;
	Page_Obj_Man pom = new Page_Obj_Man(driver);

	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application()   {
		
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("^user Enters The Username In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox()  {
		
		sendValues(pom.getLogin().getUsername(), "Pradheep30");
	}

	@When("^user Enters The Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox()  {
		
		sendValues(pom.getLogin().getPassword(), "Selenium@2022");
	}

	@Then("^user Click The LoginBtn And It Navigates InTo Search Page$")
	public void user_Click_The_LoginBtn_And_It_Navigates_InTo_Search_Page() {
		
		clickonElement(pom.getLogin().getLogin());
	}

	@When("^user Selects The Location From The DropDown$")
	public void user_Selects_The_Location_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getLocation(), "value", "Melbourne");
	}

	@When("^user Selects The Hotel From The DropDown$")
	public void user_Selects_The_Hotel_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getHotels(), "value", "Hotel Sunshine");
	}

	@When("^user user Selects The RoomType From The DropDown$")
	public void user_user_Selects_The_RoomType_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getRoomType(), "value", "Deluxe");
	}

	@When("^user Selects The NumberOfRooms From The DropDown$")
	public void user_Selects_The_NumberOfRooms_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getNumberofRooms(), "value", "2");
	}

	@When("^user Enters The CheckInDate In The InputBox$")
	public void user_Enters_The_CheckInDate_In_The_InputBox()  {
		
		sendValues(pom.getSearch().getCheckInDate(), "22/11/2022");
	}
	
	@When("^user Enters The CheckOutDate In The InputBox$")
	public void user_Enters_The_CheckOutDate_In_The_InputBox()  {
		
		sendValues(pom.getSearch().getCheckOutDate(), "25/11/2022");
	}
	
	@When("^user Selects The AdultsPerRoom From The DropDown$")
	public void user_Selects_The_AdultsPerRoom_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getAdultsperRoom(), "value", "2");
	}

	@When("^user Selects The childrensPerRoom From The DropDown$")
	public void user_Selects_The_childrensPerRoom_From_The_DropDown()  {
		
		dropDown(pom.getSearch().getChildrenperRoom(), "value", "4");
	}

	@Then("^user Clicks SubmitBtn And It Navigates InTo Select$")
	public void user_Clicks_SubmitBtn_And_It_Navigates_InTo_Select()  {
		
		clickonElement(pom.getSearch().getSubmit());
	}

	@When("^user Clicks The RadioBtn$")
	public void user_Clicks_The_RadioBtn()  {
		
		clickonElement(pom.getSelect().getRadiobutton());
	}

	@Then("^user Clicks The ContinueBtn And It Navigates InTo Booking Page$")
	public void user_Clicks_The_ContinueBtn_And_It_Navigates_InTo_Booking_Page()  {
		
		clickonElement(pom.getSelect().getConti());
	}

	@When("^user Enters The Firstname In The InputBox$")
	public void user_Enters_The_Firstname_In_The_InputBox()  {
		
		sendValues(pom.getBook().getFirstName(), "pradheep");
	}

	@When("^user Enters The Lastname In The InputBox$")
	public void user_Enters_The_Lastname_In_The_InputBox()  {
		
		sendValues(pom.getBook().getLastName(), "kumar");
	}

	@When("^user Enters The Billing Address In The InputBox$")
	public void user_Enters_The_Billing_Address_In_The_InputBox()  {
		
		sendValues(pom.getBook().getBillingAddress(), "ABC STREET,MELBOURNE,AUSTRALIA");
	}

	@When("^user Enters The Credit CardNo In The InputBox$")
	public void user_Enters_The_Credit_CardNo_In_The_InputBox()  {
		
		sendValues(pom.getBook().getCreditCardNo(), "1234567890123456");
	}

	@When("^user user Selects The Credit CardType From The DropDown$")
	public void user_user_Selects_The_Credit_CardType_From_The_DropDown()  {
		
		dropDown(pom.getBook().getCreditCardType(), "value", "MAST");
	}

	@When("^user user Selects The Expiry Month From The DropDown$")
	public void user_user_Selects_The_Expiry_Month_From_The_DropDown()  {
		
		dropDown(pom.getBook().getExpiryMonth(), "value", "3");
	}

	@When("^user user Selects The Expiry Year From The DropDown$")
	public void user_user_Selects_The_Expiry_Year_From_The_DropDown()  {
		
		dropDown(pom.getBook().getExpiryYear(), "value", "2018");
	}

	@When("^user Enters The CvvNo In The InputBox$")
	public void user_Enters_The_CvvNo_In_The_InputBox()  {
		
		sendValues(pom.getBook().getCVVNumber(), "256");
	}

	@Then("^user Clicks The BookNow Btn And It Navigates InTo Booking Confirmation Page$")
	public void user_Clicks_The_BookNow_Btn_And_It_Navigates_InTo_Booking_Confirmation_Page() throws InterruptedException  {
		clickonElement(pom.getBook().getBooknow());
		implicitWait(4000);
	}

	@When("^user Clicks The ItineraryBtn And It Navigates InTo Booked Itinerary Page$")
	public void user_Clicks_The_ItineraryBtn_And_It_Navigates_InTo_Booked_Itinerary_Page() throws InterruptedException  {
		implicitWait(5000);
		clickonElement(pom.getConfirm().getMyItinerary());
	}

	@When("^user Clicks The LogoutBtn And It Navigates InTo Logout Page$")
	public void user_Clicks_The_LogoutBtn_And_It_Navigates_InTo_Logout_Page()  {
		
		clickonElement(pom.getConfirm().getLogout());
	}

}
