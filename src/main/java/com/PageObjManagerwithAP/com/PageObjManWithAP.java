package com.PageObjManagerwithAP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pomwithAP.com.AccLogin;
import com.pomwithAP.com.AddToCart;
import com.pomwithAP.com.Authentication;
import com.pomwithAP.com.CreateAnAccount;
import com.pomwithAP.com.signIn;

public class PageObjManWithAP {
	
    WebDriver driver;
	
	private signIn sign;
	
    private Authentication Authen;
	
	private CreateAnAccount create;
	
	private AccLogin login;
	
	private AddToCart cart;
 
	public signIn getSign() {
		sign = new signIn(driver);
		return sign;
	}
	public Authentication getAuthen() {
		Authen = new Authentication(driver);
		return Authen;
	}
	public CreateAnAccount getCreate() {
		create = new CreateAnAccount(driver);
		return create;
	}
	public AccLogin getLogin() {
		login = new AccLogin(driver);
		return login;
	}
	public AddToCart getCart() {
		cart = new AddToCart(driver);
		return cart;
	}
	public PageObjManWithAP(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(this.driver, this);
							
	}

}
