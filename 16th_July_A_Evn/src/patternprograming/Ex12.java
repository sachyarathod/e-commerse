package patternprograming;


public class Ex12 {

	public static void main(String[] args) 
	{
		// *         *
		// **       **
		// ***     ***
		// ****   ****
		// ***** *****
		// ****   ****
		// ***     ***
		// **       **
		// *         *

		// declare 4 variable
		// star1=1 rows--> 9 
		// space1=5
		// star2=1;
		// space2=4
		
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		
		// outer for loop for rows
		for(int i =1;i<=9;i++)
		{
			// for star1
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			// for space1 
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			// for space
			for(int l =1;l<=space2;l++)
			{
				System.out.print(" ");
			}
			// for star2
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			  if(i<5)
				{
					star1++;
					space1--;
					star2++;
					space2--;
				}
			  else 
			  {
				    star1--;
					space1++;
					star2--;
					space2++;
			}
			}
		}
		
		
		
	}


