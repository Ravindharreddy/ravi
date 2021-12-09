package com.technoelevete.mockprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=370,originalnumber,reminder,result=0;
		originalnumber=n;
		
		while(originalnumber!=0) {
			reminder=originalnumber%10;
			result +=Math.pow(reminder,3);
			originalnumber/=10;
		}
		if(result==n) 
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}
}
