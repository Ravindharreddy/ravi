package com.technoelevate.mock;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the String1");
		String s1=scan.next();
		
		System.out.println("Enter the String2");
		String s2=scan.next();
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are Similar");
		}
		else
		{
			System.out.println("Strings are not Similar");

		}
	}

}
