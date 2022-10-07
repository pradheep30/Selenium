package com.pomwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {

	WebDriver driver;

	@FindBy(className = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	public signIn(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(this.driver, this);

	}

}
