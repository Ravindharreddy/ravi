package com.technoelevete.mockprograms;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int m=n;
		int sum=0;
		while(n>0) {
			int fact=1;
			for(int i=0;i<=n%10;i++){
				fact=fact*i;
			}
			sum+=fact;
			n/=10;
		}
		if(m==sum) {
			System.out.println("Strong");
		}else {
			System.out.println("not Strong");
		}
	}
}
