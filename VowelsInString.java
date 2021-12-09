package com.technoelevete.mockprograms;

import java.util.Scanner;

public class VowelsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int As=0;
		int Es=0;
		int Is=0;
		int Os=0;
		int Us=0;
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a') {
				As++;
			}else if(s1.charAt(i)=='e') {
				Es++;
			}else if(s1.charAt(i)=='i') {
				Is++;
			}else if(s1.charAt(i)=='o') {
				Os++;
			}else if(s1.charAt(i)=='u') {
				Us++;
			}
		}
		System.out.println("A is repet :"+As);
		System.out.println("E is repet :"+Es);
		System.out.println("I is repet :"+Is);
		System.out.println("O is repet :"+Os);
		System.out.println("U is repet :"+Us);
	}

}
