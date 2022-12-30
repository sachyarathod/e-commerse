package controlStatement;

public class ElseIf {

	public static void main(String[] args) 
	{
		
		// if marks>=66.66 then i am pass with distinction
		// if marks>=60 then i am pass with 1st class
		// if marks>=50 else i am pass with 2nd class
		// if marks>=40 else just pass
		// if marks<=40 else i am fail
		
		float marks=50;
		if(marks>=66.66)
		{
			System.out.println("I am pass with destinction");
			
		}
		
		else if (marks>=60)
		{
			System.out.println("I am pass with 1st class");
		}
		else if(marks>=50)
		{
			System.out.println("I am pass with 2nd  class");
		}
		else if (marks>=40)
		{
			System.out.println("I am just pass");
		}
		else if(marks<=40)
		{
			System.out.println("I am fail");
		}
	}

}
