package com.reader.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.BaseClass;
import com.pom.com.Book_Hotel;
import com.pom.com.Login;
import com.pomwithAP.com.AccLogin;
import com.pomwithAP.com.Authentication;
import com.pomwithAP.com.signIn;

public class FileReaderManagerWithAP extends BaseClass {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

				driver = browserLaunch(FileReaderManager.getInstancFR().getInstanceCR().getbrowser());
				launchUrl(FileReaderManager.getInstancFR().getInstanceCR().geturl());
				signIn sign =new signIn(driver);
				clickonElement(sign.getLogin());
				AccLogin login = new AccLogin(driver);
				sendValues(login.getMail(), FileReaderManager.getInstancFR().getInstanceCR().getUsername());
				sendValues(login.getPass(), FileReaderManager.getInstancFR().getInstanceCR().getPassword());
				clickonElement(login.getSublog());

			}
		
	}


