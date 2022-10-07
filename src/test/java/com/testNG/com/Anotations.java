package com.testNG.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anotations {
	
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver1\\chromedriver.exe");

	}

	@BeforeTest
	public void launch() {
		
		driver = new ChromeDriver();

	}

	@BeforeClass
	public void geturl() {
		
        driver.get("http://automationpractice.com/index.php");
	}

	@BeforeMethod
	public void signIn() {
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		driver.findElement(By.id("email")).sendKeys("abc987654331@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("women");
		driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();

	}

	@Test
	public void women() {
		driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
	}
	
	@Test
	public void dresses() {
        driver.findElement(By.xpath("(//a[@title=\"Dresses\"])[2]")).click();	
    }
	
	@Test
	public void tshirt() {
		driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[2]")).click();
	
    }
	
	@AfterMethod
	public void addtoCart() {
		driver.findElement(By.xpath("(//a[@title=\"Add to cart\"])[1]")).click();
	}

	@AfterClass
	public void checkout() {
		driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@AfterSuite
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
                                                                                        