package patternprograming;

public class Ex4 {

	public static void main(String[] args)
	{
		// * * * * * 
		// * * * *
		// * * *
		// * *
		// *
		
		// rows---> 5 , star ---> 5
		// outer loop for row 
		int star =5;
		for(int i=1;i<=5;i++)
		{
			// inner loop for column
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}
		
		

	}

}
