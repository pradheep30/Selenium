package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	

	@FindBy(id = "continue")
	private WebElement conti;
	
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getConti() {
		return conti;
	}
	
	public Select_Hotel(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);
		
					
	}


	
	
	


	}


