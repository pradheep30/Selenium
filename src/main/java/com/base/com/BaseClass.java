package com.base.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static String value;

	public static WebDriver browserLaunch(String browser) {

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver1\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();  
		}
		else
		{
			System.out.println("Invalid browser is selected");
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void clickonElement(WebElement element) {

		element.click();
	}
	public static void clearonElement(WebElement element) {
		element.clear();
	}
	public static void sendValues(WebElement element, String values) {

		element.sendKeys(values);
	}
	public static void launchUrl(String url) {

		driver.get(url);
	}
	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}
	public static void navigateBack() {

		driver.navigate().back();
	}
	public static void navigateForward() {

		driver.navigate().forward();
	}
	public static void navigateRefresh() {

		driver.navigate().refresh();
	}
	public static void printScr(String filename) throws IOException  {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File str = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\Screenshots\\"+filename+".png");
		FileUtils.copyFile(str, dest);

	}
	public static void dropDown(WebElement element, String methodtype, String values) {

		Select s = new Select(element);
		if(methodtype.equalsIgnoreCase("value")) {
			s.selectByValue(values);
		}
		else if(methodtype.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(values);
		}
		else if(methodtype.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
		} 

	}
	public static void framesbyIdex(int index ) {
		driver.switchTo().frame(index);
	}
	public static void framesbyName(String name) {
		driver.switchTo().frame(name);
	}
	public static void framesbyElement(WebElement element)  {
		driver.switchTo().frame(element);
	}
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	public static void rightclick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}
	public static void doubleclick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}
	public static void dragandDrop(WebElement element) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element).build().perform();
	}
	public static void clickandHold(WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).moveToElement(element).build().perform();
	}

	public boolean isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public boolean isSelected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}
	public boolean isEnable(WebElement element) {

		boolean enable = element.isEnabled();
		return enable;
	}
	public static void scrollDown(String values) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(values);
	}
	public static void scrollUp(String values) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(values);
	}

	public void getcurrentUrl() {

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public void getTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	public void getText(WebElement element) {

		String s = element.getText();
		System.out.println("text is :" +s);
	}

	public static void windowHandle() {

		Set<String> windowhandles = driver.getWindowHandles();
		for (String id : windowhandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
	}
	public static void simpleAlert() {

		Alert simple = driver.switchTo().alert();
		simple.accept();
	}
	public static void confirmationAlert() {

		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
	}
	public static void promptAlert(String values) {

		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(values);
		prompt.accept();
	}
	public static void implicitWait(int values) {

		driver.manage().timeouts().implicitlyWait(values, TimeUnit.SECONDS);

	}
	public static void getOptions(WebElement element) { 

		Select s = new Select(element);
		List<WebElement> option = s.getOptions();
		for (WebElement options : option) {
			System.out.println(options.getText());
		}

	}
	public static void close() {

		driver.close();
	}
	public static void quit() {

		driver.quit();
	}
	public static String readData(String path, int row_index, int cell_index) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		Row row = sheetat.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType celltype = cell.getCellType();
		
		if (celltype.equals(CellType.STRING)) {
			value = cell.getStringCellValue();	
		
		}
		else if (celltype.equals(CellType.NUMERIC)) {
			double numericcellvalue = cell.getNumericCellValue();
			int data = (int) numericcellvalue;
			value = String.valueOf(data);
		
	}
		return value;
	}
	}
