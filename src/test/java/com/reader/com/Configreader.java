package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	
	Properties p;
	
	public Configreader() throws IOException {
		
		File f = new File("C:\\Users\\pc\\eclipse-workspace\\MavenProject\\configuration\\config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String geturl() {
		

		String urllink = p.getProperty("url");
		return urllink;
		
	}
	
	public String getbrowser() {
		
		String browser = p.getProperty("browsername");
		return browser;
	}
	
	public String getUsername() {
		
		String name = p.getProperty("username");
		return name;
	}
	
	public String getPassword() {
		
		String pwd = p.getProperty("password");
		return pwd;
	}
	
	public String getAccno() {
		
		String acc = p.getProperty("accno");
		return acc;
	}
	
	public String getCvv() {
		
		String cvvno = p.getProperty("cvv");
		return cvvno;

	}

	}


