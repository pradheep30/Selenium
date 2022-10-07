package com.PageObjManager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.Book_Hotel;
import com.pom.com.Booked_Itinerary;
import com.pom.com.Login;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

public class Page_Obj_Man   {
	
	WebDriver driver;
	
	private Login login;
	
	private Search_Hotel Search;
	
	private Select_Hotel select;
	
	private Book_Hotel book;
	
	private Booked_Itinerary confirm;

	public Login getLogin() {
		
		login = new Login(driver);
		return login;
	}
	public Search_Hotel getSearch() {
		
		Search = new Search_Hotel(driver);
		return Search;
	}
	public Select_Hotel getSelect() {
		
		select = new Select_Hotel(driver);
		return select;
	}
	public Book_Hotel getBook() {
		
		book = new Book_Hotel(driver);
		return book;
	}
	public Booked_Itinerary getConfirm() {
		
		confirm = new Booked_Itinerary(driver);
		return confirm;
	}
	public Page_Obj_Man(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);
							
	}
	
	
	
	
	
}

 