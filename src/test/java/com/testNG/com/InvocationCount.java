package com.testNG.com;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	public void aMethod() {
		System.out.println("A Method");
	}
	@Test(invocationCount = 3)
	public void bMethod() {
		System.out.println("B Method");
	}
	@Test
	public void cMethod() {
		System.out.println("c Method");
	}
	@Test
	public void dMethod() {
		System.out.println("D Methed");
	}

}
