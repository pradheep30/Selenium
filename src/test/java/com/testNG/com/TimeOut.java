package com.testNG.com;

import org.testng.annotations.Test;

public class TimeOut {

		@Test(timeOut = 1000)
		public void aMethod() throws InterruptedException {
			Thread.sleep(2000);
			System.out.println("A Method");
		}
		@Test
		public void bMethod() throws InterruptedException {
			Thread.sleep(1000);
			System.out.println("B Method");
		}
		@Test
		public void cMethod() throws InterruptedException {
			Thread.sleep(1000);
			System.out.println("c Method");

	}

}
