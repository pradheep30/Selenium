package com.reader.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.BaseClass;
import com.pom.com.Book_Hotel;
import com.pom.com.Login;
import com.pomwithAP.com.Authentication;
import com.pomwithAP.com.signIn;

public class FileReaderManagerWithBase extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = browserLaunch(FileReaderManager.getInstancFR().getInstanceCR().getbrowser());
		launchUrl(FileReaderManager.getInstancFR().getInstanceCR().geturl());
		signIn sign =new signIn(driver);
		clickonElement(sign.getLogin());
		Authentication authen =new Authentication(driver);
		sendValues(authen.getEmail(), FileReaderManager.getInstancFR().getInstanceCR().getUsername());
		clickonElement(authen.getSubmit());

	}
}