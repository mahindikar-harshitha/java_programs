package com.day3;

import java.util.Scanner;

public class SwitchCondition {
	public static void main(String[] args) {
		System.out.println("enter number a,b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		switch(c)
		{
		case 1: c=a+b;
	            break;
		case 2: c=a-b;
		        break;
		case 3: c=a*b;
		        break;
		case 4: c=a/b;
		        break;
		case 5: c=a%b;
		        break;
	     default: System.out.println("no operation is possible");
		 
		}
	}

}
