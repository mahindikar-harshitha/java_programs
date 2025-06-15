package com.day3;

import java.util.Scanner;

public class Ifcondition {

	public static void main(String[] args) {
		System.out.println("enter number a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		if(a>b)
		{
			System.out.println("addition of" +c);
		}
	}
}
