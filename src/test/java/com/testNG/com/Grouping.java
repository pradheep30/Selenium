package com.testNG.com;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "smoketest1")
	public void setUp() {
		System.out.println("system.setproerty");
	}

	@Test(groups = "smoketest2")
	public void launch() {
		System.out.println("launchbrowser");

	}

	@Test(groups = "smoketest2")
	public void login() {
		System.out.println("login");

	}

	@Test(groups = {"smoketest1","smoketest2"})
	public void search() {
		System.out.println("search");

	}

}
