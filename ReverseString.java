package com.technoelevete.mockprograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2="";
		String[] s3=s1.split(" ");
		for(int i=s3.length-1;i>=0;i--) {
			s2=s2+" "+s3[i];
		}
		System.out.println(s2);
	}
}