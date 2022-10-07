package com.pomwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	
	WebDriver driver;
	
	@FindBy(id = "id_gender1") 
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastname1;
	
	@FindBy(id = "passwd") 
	private WebElement password;
	
	@FindBy(id = "days")
	private WebElement day;
	
	@FindBy(id = "months")
	private WebElement month1;
	
	@FindBy(id = "years") 
	private WebElement year;
	
	@FindBy(id = "newsletter")
	private WebElement news1;
	
	@FindBy(id = "optin")
	private WebElement options1;
	
	@FindBy(id = "firstname") 
	private WebElement fname;
	
	@FindBy(id = "lastname")
	private WebElement lname;
	
	@FindBy(id = "company")
	private WebElement comp;
	
	@FindBy(id = "address1") 
	private WebElement addr1;
	
	@FindBy(id = "address2") 
	private WebElement addr2;
	
	@FindBy(id = "city")
	private WebElement city1;

	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement postal;
	
	@FindBy(id = "other") 
	private WebElement other1;
	
	@FindBy(id = "phone")
	private WebElement ph;
	
	@FindBy(id = "phone_mobile")
	private WebElement mob;
	
	@FindBy(id = "alias") 
	private WebElement alia;
	
	@FindBy(id = "submitAccount")
	private WebElement submitacc;
	
	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname1() {
		return lastname1;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth1() {
		return month1;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNews1() {
		return news1;
	}

	public WebElement getOptions1() {
		return options1;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getComp() {
		return comp;
	}

	public WebElement getAddr1() {
		return addr1;
	}
	
	public WebElement getAddr2() {
		return addr2;
	}

	public WebElement getCity1() {
		return city1;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostal() {
		return postal;
	}

	public WebElement getOther1() {
		return other1;
	}

	public WebElement getPh() {
		return ph;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getAlia() {
		return alia;
	}

	public WebElement getSubmitacc() {
		return submitacc;
	}
	
	public CreateAnAccount(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(this.driver, this);

	}
	
}
