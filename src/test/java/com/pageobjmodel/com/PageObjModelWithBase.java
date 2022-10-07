package com.pageobjmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.BaseClass;
import com.pom.com.Book_Hotel;
import com.pom.com.Booked_Itinerary;
import com.pom.com.Login;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

public class PageObjModelWithBase extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");
		launchUrl("http://adactinhotelapp.com/");
		Login login = new Login(driver);
		Search_Hotel search = new Search_Hotel(driver);
		Select_Hotel select = new Select_Hotel(driver);
		Book_Hotel book = new Book_Hotel(driver);
		Booked_Itinerary confirm = new Booked_Itinerary(driver);
		//Login
		sendValues(login.getUsername(), "Pradheep30");
		sendValues(login.getPassword(), "Selenium@2022");
		clickonElement(login.getLogin());
		//Search    Hotel
		WebElement ele1 = search.getLocation();
		dropDown(ele1, "value", "Melbourne");
		WebElement ele2 = search.getHotels();
		dropDown(ele2, "value", "Hotel Sunshine");
		WebElement ele3 = search.getRoomType();
		dropDown(ele3, "value", "Deluxe");
		WebElement ele4 = search.getNumberofRooms();
		dropDown(ele4, "value", "2");
		WebElement ele5 = search.getCheckInDate();
		clearonElement(ele5);
		sendValues(ele5, "22/11/2022");
		WebElement ele6 = search.getCheckOutDate();
		clearonElement(ele6);
		sendValues(ele6, "25/11/2022");
		WebElement ele7 = search.getAdultsperRoom();
		dropDown(ele7, "value", "2");
		WebElement ele8 = search.getChildrenperRoom();
		dropDown(ele8, "value", "4");
		WebElement ele9 = search.getSubmit();
		clickonElement(ele9);
		//Select Hotel
		WebElement ele10 = select.getRadiobutton();
		clickonElement(ele10);
		WebElement ele11 = select.getConti();
		clickonElement(ele11);
		//Book A Hotel 
		sendValues(book.getFirstName(), "Pradheep");
		sendValues(book.getLastName(), "kumar");
		sendValues(book.getBillingAddress(), "ABC STREET,MELBOURNE,AUSTRALIA");
		sendValues(book.getCreditCardNo(), "1234567890123456");
		WebElement ele12 = book.getCreditCardType();
		dropDown(ele12, "value", "MAST");
		WebElement ele13 = book.getExpiryMonth();
		dropDown(ele13, "value", "3");
		WebElement ele14 =  book.getExpiryYear();
		dropDown(ele14, "value", "2014");
		sendValues(book.getCVVNumber(), "123");
		clickonElement(book.getBooknow());
		//Booking Confirmation
		implicitWait(30);
		WebElement ele15 = confirm.getMyItinerary();
		clickonElement(ele15);
		clickonElement(confirm.getLogout());
		close();
		System.out.println("Successfully Completed");



	}

}
