package com.ProObjManWithAP.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjManagerwithAP.com.PageObjManWithAP;
import com.base.com.BaseClass;

public class ProObjManWithAP extends BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = browserLaunch("chrome");
		launchUrl("http://automationpractice.com/index.php");
		PageObjManWithAP POM = new PageObjManWithAP(driver);
		POM.getSign().getLogin().click();
		Thread.sleep(3000);
		POM.getAuthen().getEmail().sendKeys("ABC4425486@GMAIL.COM");
		POM.getAuthen().getSubmit().click();
		implicitWait(30);
		POM.getCreate().getGender().click();
		POM.getCreate().getFirstname().sendKeys("PRADHEEP");
		POM.getCreate().getLastname1().sendKeys("KUMAR");
		POM.getCreate().getPassword().sendKeys("123456");
		dropDown(POM.getCreate().getDay(), "value", "10");
		dropDown(POM.getCreate().getMonth1(), "value", "4");
		dropDown(POM.getCreate().getYear(), "value", "2018");
		POM.getCreate().getNews1().click();
		POM.getCreate().getOptions1().click();
		POM.getCreate().getFname().sendKeys("pradheeep");
		POM.getCreate().getLname().sendKeys("kumar");
		POM.getCreate().getComp().sendKeys("abc");
		POM.getCreate().getAddr1().sendKeys("abc street madurai");
		POM.getCreate().getAddr2().sendKeys("d block");
		POM.getCreate().getCity1().sendKeys("madurai");
		POM.getCreate().getState().sendKeys("tn");
		POM.getCreate().getPostal().sendKeys("12345");
		POM.getCreate().getPh().sendKeys("123456");
		POM.getCreate().getMob().sendKeys("12365");
		POM.getCreate().getAlia().sendKeys("bbbbebbb");
		clickonElement(POM.getCreate().getSubmitacc());
		clickonElement(POM.getLogin().getLogout());
		String username = readData("C:\\\\Users\\\\pc\\\\Desktop\\\\user_details.xlsx", 1, 0);
		POM.getLogin().getMail().sendKeys(username);
		String password = readData("C:\\\\Users\\\\pc\\\\Desktop\\\\user_details.xlsx", 1, 1);
		POM.getLogin().getPass().sendKeys(password);
		clickonElement(POM.getLogin().getSublog());
		clickonElement(POM.getCart().getTshirt());
		implicitWait(20);
		clickonElement(POM.getCart().getImg());
		implicitWait(30);
		framesbyIdex(0);
		doubleclick(POM.getCart().getPass());
		dropDown(POM.getCart().getGroup(), "value", "3");
		clickonElement(POM.getCart().getColor());
		clickonElement(POM.getCart().getExclus());
		close();
		System.out.println("Successfully Completed");
		
	}

}
