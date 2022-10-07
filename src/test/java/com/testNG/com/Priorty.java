package com.testNG.com;

import org.testng.annotations.Test;

public class Priorty {
	
	@Test(priority = 4)
	public void aMethod() {
		System.out.println("A Method");
	}
	@Test(priority = 3)
	public void bMethod() {
		System.out.println("B Method");
	}
	@Test(priority = 2)
	public void cMethod() {
		System.out.println("c Method");
	}
	@Test(priority = 1)
	public void dMethod() {
		System.out.println("D Methed");
	}


	
	

}
