Aspackage com.technoelevate.mock;

import java.util.Scanner;

public class CharAvailable {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.next();
		System.out.println("Enter the Character");
		char ch=scan.next().charAt(0);
		
		int index=s1.indexOf(ch);
		if(index==-1)
		{
			System.out.println("given character " +ch+ " is not present");
		}
		else
		{
			System.out.println("given character" +ch+ " is present @index number :" +index);
		}
	}
}
