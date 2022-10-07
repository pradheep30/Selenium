package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	WebDriver driver;

	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id = "room_type")
	private WebElement RoomType; 
	
	@FindBy(id = "room_nos")
	private WebElement NumberofRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id = "adult_room")
	private WebElement AdultsperRoom;
	
	@FindBy(id = "child_room")
	private WebElement ChildrenperRoom;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}

	public WebElement getChildrenperRoom() {
		return ChildrenperRoom;
	}
	
	public WebElement getSubmit() {
		return Submit;
	}
	
	public Search_Hotel(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);
		
					
	}

}


