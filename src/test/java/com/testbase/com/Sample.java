package com.testbase.com;

import com.base.com.BaseClass;

public class Sample extends BaseClass {

	public static void main(String[] args) throws InterruptedException   {
		
		browserLaunch("firefox");
		launchUrl("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		scrollUp("window.scroll(0,1000)");

	}

}
