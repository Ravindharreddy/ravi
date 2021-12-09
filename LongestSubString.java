package com.technoelevete.mockprograms;

import java.util.Scanner;

public class LongestSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String[] s2=s1.split(s1);
		int big=0;
		int index=0;
		for(int i=0;i<s2.length-1;i++) {
			int tempBig=s2[i].length();
			
			if(tempBig>big) {
				big=tempBig;
				index=i;
			}
		}
		System.out.println(s1);
		System.out.println(s2[index]);
	}

}
