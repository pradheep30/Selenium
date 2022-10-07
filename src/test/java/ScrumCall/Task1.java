package ScrumCall;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1  {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		        System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\pc\\eclipse-workspace\\MavenProject\\driver1\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.makemytrip.com/");
		        driver.manage().window().maximize();
		        driver.findElement(By.xpath("//li[@class='menu_Buses']")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//From and To Details
		        driver.findElement(By.xpath("//label[@class=\"lbl_input makeFlex column latoBold\"]")).click();
		        driver.findElement(By.xpath("(//p[@class=\"searchedResult font14 darkText\"])[7]")).click();
		        driver.findElement (By.xpath("(//label[@class=\"lbl_input latoBold makeFlex column\"])[1]"));
		        WebElement ele = driver.findElement(By.xpath("(//p[@class=\"searchedResult font14 darkText\"])[3]"));
		        JavascriptExecutor js = (JavascriptExecutor)driver;
		        js.executeScript("arguments[0].click()", ele);
		    	WebElement ele1 = driver.findElement(By.xpath("(//div[contains(text(),'17')])[1]"));
		    	ele1.click();
		        driver.findElement(By.id("search_button")).click();
		        
		        //Bus Details
		        driver.findElement(By.xpath("//img[@class=\"primoCloseIcon\"]")).click();
		        driver.findElement(By.xpath("(//a[@class=\"sc-jKJlTe bPClQZ\"])[1]")).click();
		        driver.findElement(By.xpath("(//img[@class=\"seat-icon\"])[5]")).click();
		        driver.findElement(By.xpath("//div[@class=\"cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active\"]")).click();
		        
		        //Traveler Details
		        driver.findElement(By.id("fname")).sendKeys("pradheep");
		        driver.findElement(By.id("age")).sendKeys("30");
		        driver.findElement(By.xpath("//p[@class=\"GenderOptionSelection  validationError\"]")).click();		        driver.findElement(By.xpath("(//li[@class=\" removeOutline\"])[1]")).click();
		        driver.findElement(By.id("contactEmail")).sendKeys("ABC@gmail.com");
		        driver.findElement(By.id("mobileNumber")).sendKeys("9176244882");
		        driver.findElement(By.xpath("(//span[@class=\"appendRight10\"])[2]")).click();
		        driver.findElement(By.xpath("//a[@class=\"paymentBtn whiteText latoBold font16 capText\"]")).click();
		        System.out.println("Booking completed");
		         

	}

}
