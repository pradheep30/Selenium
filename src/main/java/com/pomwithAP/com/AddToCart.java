package com.pomwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]") 
	private WebElement tshirt;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement img;
	
	@FindBy(className = "icon-plus")
	private WebElement pass;
	
	@FindBy(id = "group_1") 
	private WebElement group;
	
	@FindBy(id = "color_14") 
	private WebElement color;
	
	@FindBy(className = "exclusive") 
	private WebElement exclus;
	
	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getGroup() {
		return group;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getExclus() {
		return exclus;
	}
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(this.driver, this);

	}

}
