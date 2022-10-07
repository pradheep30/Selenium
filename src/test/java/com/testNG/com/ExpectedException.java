package com.testNG.com;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() {
		int c=5/0;
		System.out.println("A Method");
	}
	@Test
	public void bMethod() {
		System.out.println("B Method");
	}
	@Test
	public void cMethod() {
		System.out.println("c Method");
	}


}
