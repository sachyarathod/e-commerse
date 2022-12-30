package patternprograming;

public class Ex1 {

	public static void main(String[] args)
	{
		// if i want to print * like this
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		// outer for loop for Rows
		for(int i =1;i<=5;i++)
		{
			// inner for loop for column
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
