package patternprograming;

public class Ex7 {

	public static void main(String[] args) 
	{
		//   *
		//  **
		//  ***
		// ****
		//*****
		
		// rows-->5,space=4, star=1
		int star=1;
		int space=4;
		// outer loop for row
		for(int i =1;i<=5;i++)
		{
			// for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
