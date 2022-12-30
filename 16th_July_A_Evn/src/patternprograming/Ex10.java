package patternprograming;

public class Ex10 {

	public static void main(String[] args)
	{
		
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		// count row-->9,  star -->1
		int star=1;
		
		// outer for loop for rows
		for(int i=1;i<=9;i++)
		{
			// inner loop for column
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star++;
			}
			else 
			{
				star--;
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
