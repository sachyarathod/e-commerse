package patternprograming;

public class Ex3 {

	public static void main(String[] args) 
	{
		// ****
		// ***
		// **
		// *
		
		// No row--> 4 , star --> 4
		int star =4;
		for(int i=1;i<=4;i++)
		{
			// inner fop loop for column
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		

	}

}
