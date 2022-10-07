package com.facebookrunner.com;

import com.pojo.com.pojotopic;

public class pojorunner {

	public static void main(String[] args) {
		
      pojotopic pojo = new pojotopic();  //calling properties without using extends keyword
      pojo.setAge(30);
      pojo.setName("Pradeep");
      int age = pojo.getAge();
      System.out.println(age);
      String name = pojo.getName();
      System.out.println(name);
	}

}
