package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
	WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement myItinerary;
	

	@FindBy(id = "logout")
	private WebElement logout;

	
	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public Booked_Itinerary(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);


	}

}