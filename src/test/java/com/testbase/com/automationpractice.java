package com.testbase.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.base.com.BaseClass;

public class automationpractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		launchUrl("http://automationpractice.com/index.php");
		//SignIn
		WebElement element = driver.findElement(By.className("login"));
		clickonElement(element);
		//Authentication
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendValues(ele, "4328@gmail.com");
		WebElement elem = driver.findElement(By.id("SubmitCreate"));
		clickonElement(elem);
		//CREATE AN ACCOUNT
		implicitWait(30);
        WebElement gender = driver.findElement(By.id("id_gender1"));
        clickandHold(gender);
        WebElement ele1 = driver.findElement(By.id("customer_firstname"));
        sendValues(ele1, "pradeep");
        WebElement ele2 = driver.findElement(By.id("customer_lastname"));
        sendValues(ele2, "kumar");
        WebElement ele3 = driver.findElement(By.id("passwd"));
        sendValues(ele3, "123456");
        WebElement ele4 = driver.findElement(By.id("days"));
        dropDown(ele4, "value", "10");
        WebElement month = driver.findElement(By.id("months"));
        dropDown(month, "value", "4");
        WebElement year = driver.findElement(By.id("years"));
        dropDown(year, "value", "2018");
        WebElement ele5 = driver.findElement(By.id("newsletter"));
        clickonElement(ele5);
        WebElement ele6 = driver.findElement(By.id("optin"));
        clickonElement(ele6);
        WebElement ele7 = driver.findElement(By.id("firstname"));
        sendValues(ele7, "pradeep");
        WebElement ele8 = driver.findElement(By.id("lastname"));
        sendValues(ele8, "kumar");
        WebElement ele9 = driver.findElement(By.id("company"));
        sendValues(ele9, "abc");
        WebElement ele10 = driver.findElement(By.id("address1"));
        sendValues(ele10, "NO 23, xyz street, madurai");
        WebElement ele11 = driver.findElement(By.id("address2"));
        sendValues(ele11, "D block");
        WebElement ele12 = driver.findElement(By.id("city"));
        sendValues(ele12, "madurai");
        WebElement ele13 = driver.findElement(By.id("id_state"));
        sendValues(ele13, "California");
        WebElement ele14 = driver.findElement(By.id("postcode"));
        sendValues(ele14, "12345");
        WebElement ele15 = driver.findElement(By.id("other"));
        sendValues(ele15, "9054854");
        WebElement ele16 = driver.findElement(By.id("phone"));
        sendValues(ele16, "241564");
        WebElement ele17 = driver.findElement(By.id("phone_mobile"));
        sendValues(ele17, "6524586");
        WebElement ele18 = driver.findElement(By.id("alias"));
        sendValues(ele18, "56,abc st,usa");
        WebElement ele19 = driver.findElement(By.id("submitAccount"));
        clickonElement(ele19);
        //Account login
        WebElement ele20 = driver.findElement(By.xpath("//a[@title='Log me out']"));
        clickonElement(ele20);
        WebElement ele21 = driver.findElement(By.id("email"));
        sendValues(ele21, "4327@gmail.com");
        WebElement ele22 = driver.findElement(By.id("passwd"));
        sendValues(ele22, "123456");
        WebElement ele23 = driver.findElement(By.id("SubmitLogin"));
        clickonElement(ele23);
        //Add To Cart
        WebElement ele24 = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
        clickonElement(ele24);
        WebElement ele25 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
        clickonElement(ele25);
        Thread.sleep(5000);
        framesbyIdex(0);
        WebElement ele26 = driver.findElement(By.className("icon-plus"));
        doubleclick(ele26);
     	WebElement ele27 = driver.findElement(By.id("group_1"));
	    dropDown(ele27, "value", "3");
	    WebElement ele28 = driver.findElement(By.id("color_14"));
	    clickonElement(ele28);
	    WebElement ele29 = driver.findElement(By.className("exclusive"));
		clickonElement(ele29);
		System.out.println("Successfully Runned");
       
        
	}

}
