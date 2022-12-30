package patternprograming;

public class Ex5 {

	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		// count row--->5,  star--->1
		
		int star =1;
		
		// outer loop for row
		for(int i =1;i<=5;i++)
		{
			// inner loop for column
			for(int j =1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		

	}

}
