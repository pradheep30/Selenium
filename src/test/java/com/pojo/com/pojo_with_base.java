package com.pojo.com;

public class pojo_with_base {

	public static void main(String[] args) {
		
		pojotopic pojo = new pojotopic();
		
		int age = pojo.getAge();
		System.out.println("Getters Method : " + age);
		
		String name = pojo.getName();
		System.out.println("Getters Method : " + name);
		
		pojo.setAge(30);
		int age1 = pojo.getAge();
		System.out.println("Setters Method : " + age1);
				
		pojo.setName("Pradheep");
		String name1 = pojo.getName();
		System.out.println("Setters Method : " + name1);
	}

}
