package com.day3;

import java.util.Scanner;

public class Ifelsecondition {
	public static void main(String[] args) {
		System.out.println("enter a age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
		}
		
	}

}
