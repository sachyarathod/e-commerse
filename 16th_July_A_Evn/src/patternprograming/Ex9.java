package patternprograming;

public class Ex9 {

	public static void main(String[] args)
	{
		
		
		//   *
		//  ***
		// *****
		//*******
		
		// rows->4 , star->1 ,space->3
		int star=1;
		int space =3;
		// outer for loop for rows
		for(int i=1;i<=4;i++)
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
			star=star+2;
			space--;
		}

	}

}
