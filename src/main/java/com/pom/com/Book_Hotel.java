package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id  = "address")
	private WebElement BillingAddress;
	
	@FindBy(id = "cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id = "cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement CVVNumber;
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	public Book_Hotel(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);
		
					
	}


	}


