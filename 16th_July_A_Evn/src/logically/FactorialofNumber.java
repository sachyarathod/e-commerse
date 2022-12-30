package logically;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		 int number = sc.nextInt();
		 int mul =1;
		 for(int i=number;i>=1;i--)
		 {
			 mul = mul*i;
		 }

		 System.out.println("the factorial of "+number+ " is "+mul);
		 
		 // i want factorial of 10 number
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		int sum = 1;
		for(int i =secondNum;i>=1;i--)
		{
			sum = sum*i;
		}
		System.out.println("the factorial of "+secondNum+" is "+sum);
	}

}
