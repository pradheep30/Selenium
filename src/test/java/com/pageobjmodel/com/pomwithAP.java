package com.pageobjmodel.com;

import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;
import com.pomwithAP.com.AccLogin;
import com.pomwithAP.com.AddToCart;
import com.pomwithAP.com.Authentication;
import com.pomwithAP.com.CreateAnAccount;
import com.pomwithAP.com.signIn;

public class pomwithAP extends BaseClass{
	
	public static WebDriver driver;


	public static void main(String[] args) {
		
		driver = browserLaunch("chrome");
		launchUrl("http://automationpractice.com/index.php");
		signIn sign = new signIn(driver);
		Authentication authen = new Authentication(driver);
		CreateAnAccount createacc = new CreateAnAccount(driver);
		AccLogin acclogin = new AccLogin(driver);
		AddToCart cart = new AddToCart(driver);
		//sign in
		clickonElement(sign.getLogin());
		//authentication
		sendValues(authen.getEmail(), "abc653256@gmail.com");
		clickonElement(authen.getSubmit());
		//create an acc
		implicitWait(30);
		clickonElement(createacc.getGender());
		sendValues(createacc.getFirstname(), "pradheep");
		sendValues(createacc.getLastname1(), "kumar");
		sendValues(createacc.getPassword(), "123456");
		dropDown(createacc.getDay(), "value", "10");
		dropDown(createacc.getMonth1(), "value", "4");
		dropDown(createacc.getYear(), "value", "2018");
		clickonElement(createacc.getNews1());
		clickonElement(createacc.getOptions1());
		sendValues(createacc.getFname(), "pradheep");
		sendValues(createacc.getLname(), "kumar");
		sendValues(createacc.getComp(), "abc");
		sendValues(createacc.getAddr1(), "NO 23, xyz street, madurai'");
		sendValues(createacc.getAddr2(), "d block");
		sendValues(createacc.getCity1(), "madirai");
		sendValues(createacc.getState(), "tn");
		sendValues(createacc.getPostal(), "62510");
		sendValues(createacc.getOther1(), "juvv");
		sendValues(createacc.getPh(), "625026");
		sendValues(createacc.getMob(), "265456");
		sendValues(createacc.getAlia(), "vvvvuv");
		clickonElement(createacc.getSubmitacc());
		//acc login
		clickonElement(acclogin.getLogout());
		sendValues(acclogin.getMail(), "abc653256@gmail.com");
		sendValues(acclogin.getPass(), "123456");
		clickonElement(acclogin.getSublog());
		//add to cart
		clickonElement(cart.getTshirt());
		clickonElement(cart.getImg());
		implicitWait(20);
		framesbyIdex(0);
		doubleclick(cart.getPass());
		dropDown(cart.getGroup(), "value", "3");
		clickonElement(cart.getColor());
		clickonElement(cart.getExclus());
		
		
		
		
		
		
		
		


	}

}
