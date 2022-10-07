package com.pomwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authentication {
	
	WebDriver driver;

	@FindBy(xpath = "(//input[@type='text'])[2]") 
	private WebElement email;
	
	@FindBy(id = "SubmitCreate")
	private WebElement submit;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public Authentication(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(this.driver, this);

	}

		

	
	
	


}
