package com.pageobjmanager.com;

import org.openqa.selenium.WebDriver;

import com.PageObjManager.com.Page_Obj_Man;
import com.base.com.BaseClass;

public class PageObjManagerWithBase extends BaseClass {
	
	public static WebDriver driver;

	public static void main(String[] args)  {
		
		driver = browserLaunch("firefox");
		launchUrl("http://adactinhotelapp.com/");
		Page_Obj_Man pom = new Page_Obj_Man(driver);
		//Login
		pom.getLogin().getUsername().sendKeys("Pradheep30");
		pom.getLogin().getPassword().sendKeys("Selenium@2022");
		pom.getLogin().getLogin().click();
		//Search
		dropDown(pom.getSearch().getLocation(), "value", "Melbourne");
		dropDown(pom.getSearch().getHotels(), "value", "Hotel Sunshine");
		dropDown(pom.getSearch().getRoomType(), "value", "Deluxe");
		dropDown(pom.getSearch().getNumberofRooms(), "value", "2");
		pom.getSearch().getCheckInDate().sendKeys("22/11/2022");
		pom.getSearch().getCheckOutDate().sendKeys("25/11/2022");
		dropDown(pom.getSearch().getAdultsperRoom(), "value", "2");
		dropDown(pom.getSearch().getChildrenperRoom(), "value", "4");
		pom.getSearch().getSubmit().click();
		//Select
		pom.getSelect().getRadiobutton().click();
		pom.getSelect().getConti().click();
		//Book
		pom.getBook().getFirstName().sendKeys("Pradheep");
		pom.getBook().getLastName().sendKeys("kumar");
		pom.getBook().getBillingAddress().sendKeys("ABC STREET,MELBOURNE,AUSTRALIA");
		pom.getBook().getCreditCardNo().sendKeys("1234567890123456");
		dropDown(pom.getBook().getCreditCardType(), "value", "MAST");
		dropDown(pom.getBook().getExpiryMonth(), "value", "3");
		dropDown(pom.getBook().getExpiryYear(), "value", "2018");
		pom.getBook().getCVVNumber().sendKeys("123");
		pom.getBook().getBooknow().click();
		//Confirmation
        implicitWait(30);
        pom.getConfirm().getMyItinerary().click();
        pom.getConfirm().getLogout().click();
	}

}
