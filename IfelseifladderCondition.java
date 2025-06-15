package com.day3;

import java.util.Scanner;

public class IfelseifladderCondition {
	public static void main(String[] args) {
		System.out.println("enter a,b,c");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is greater than b,c" +a);
			
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater than a,c" +b);
		}
		else
		{
			System.out.println("c is greater than a,b" +c);
		}
	}

}
