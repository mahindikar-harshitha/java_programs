package com.day3;

public class MainAbstract {
	
	public static void main(String[] args) {
		Person john = new Veg();
		john.speak();
		john.eat();
		System.out.println("=======================");
		Person mia = new Nonveg();
		mia.speak();
		mia.eat();
	}

}
