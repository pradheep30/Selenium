package com.pomwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccLogin {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Log me out']") 
	private WebElement logout;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(id = "passwd")
	private WebElement pass;
	
	@FindBy(id = "SubmitLogin") 
	private WebElement sublog;


	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSublog() {
		return sublog;
	}
	
	public AccLogin(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(this.driver, this);

	}

}
