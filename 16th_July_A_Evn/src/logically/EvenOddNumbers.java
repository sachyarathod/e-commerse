package logically;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value ");

		int t = sc.nextInt();
		
		if(t%2==0)
		{
			System.out.println("given number is even number");
		}
		else 
		{
			System.out.println("given number is odd number");
		}
		
		
		int a = 12;
		int b = 15;
		
		System.out.println(a%2);
		System.out.println(b/ 2);
		
	}

}
