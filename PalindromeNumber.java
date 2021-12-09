package com.technoelevete.mockprograms;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=12321;
		int m=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10 + n%10;
			n=n/10;
		}
		if(m==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
