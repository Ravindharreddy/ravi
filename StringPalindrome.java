package com.technoelevete.mockprograms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--){
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.contentEquals(s2)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
