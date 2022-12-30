package logically;

import java.util.Scanner;

public class ReverseTheNumberUsingString {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int originalNumber = sc.nextInt();
		String orgString = Integer.toString(originalNumber);
	    String RevString ="";
		for(int i=orgString.length()-1;i>=0;i--)
		{
			char t = orgString.charAt(i);
			RevString = RevString+t;
		}

		System.out.println(RevString);
		
		int ReverseNumber = Integer.parseInt(RevString);
		
		System.out.println("Given number is "+originalNumber);
		System.out.println("=================================");
		System.out.println("Reverse number is "+ReverseNumber);
		
		
		System.out.println("=======================");
		System.out.println("Enter second number");
		int OrgNumber1 = sc.nextInt();
		String orgString1 = Integer.toString(OrgNumber1);
		String RevString1 = "";
		for(int i=orgString1.length()-1;i>=0;i--)
		{
			char m = orgString1.charAt(i);
			RevString1 =RevString1+m;
		}
		System.out.println(RevString1);
		
		int RevNumber1 = Integer.parseInt(RevString1);
		
		System.out.println("givern number is "+orgString1);
		System.out.println("reverse number is "+RevNumber1);
	}

}
