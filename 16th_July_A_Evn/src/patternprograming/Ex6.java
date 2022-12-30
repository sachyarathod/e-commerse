package patternprograming;

public class Ex6 {

	public static void main(String[] args) 
	{
		// *****
		//  ****
		//  ***
		//  **
		//  *
		
		// count row--->5, star-->5
		int star=5;
		int space=0;
		// outer for loop for row
		for(int i =1;i<=5;i++)
		{
			// inner for loop for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			// for loop for star
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	
		
	}

}
