 package com.testNG.com;

import org.testng.annotations.Test;

public class ParallelRun {
	
	@Test
	public void setUp() {
		System.out.println("system.setproerty");
	}

	@Test
	public void launch() {
		System.out.println("launchbrowser");

	}

	@Test
	public void login() {
		System.out.println("login");

	}

	@Test
	public void search() {
		System.out.println("search");

	}

}

	

