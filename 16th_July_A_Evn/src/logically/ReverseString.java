package logically;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string ");
		
		String original = sc.next();
		
		String s = "Velocity";
		String rev = "";
		
		System.out.println("=======================================");
		for(int i=original.length()-1;i>=0;i--)
		{
			char ts = original.charAt(i); // 7
			rev = rev+ts;  // yti
		}
		System.out.println("original string is "+original);
		System.out.println("Reverse string is "+rev);

		if(original.equals(rev))
		{
			System.out.println("String is palendrom");
		}
		else 
		{
			System.out.println("STring is not palendrom");
		}
	}

}
