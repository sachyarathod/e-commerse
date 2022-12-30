package arrayStudy;

public class TwoDimensional {

	public static void main(String[] args)
	{
		
		// array declaration
		
		int RollNo [][] = new int[2][2];  
		
		// array initialization
	//	RollNo[0][0]= 10;
	//	RollNo[0][1]= 20;
	//	RollNo[1][0]= 30;
	//	RollNo[1][1]= 40;
		
		
		// usages
		
		System.out.print(RollNo[0][0]+" ");
		System.out.println(RollNo[0][1]);
		System.out.print(RollNo[1][0]+" ");
		System.out.println(RollNo[1][1]);
		
		
		
		int No [][]= {{1,2,3},{4,5,6},{7,8,9}};
		
	//	System.out.println(No[1][1]);
	
	  System.out.println("===================================");
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=2;j++) 
			{
				System.out.print(No[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		char grade [][]= {{'a','b','c'},{'e','f','d'}};
		
		
		for(int i =0;i<=1;i++) // for row 
		{
			for(int j =0;j<=2;j++) // for column
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		
		String name [][]= {{"Sachin","vishal","sai"},{"rathod","vishal","sandip"},{"sai","rohit","vaibhav"}};
		
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==============================================");
		// using dynamic for loop 
		for(int i=name.length-1;i>=0;i--)
		{
			for(int j=name.length-1;j>=0;j--)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==============================================");
		int ro [][]= {{1,3,4,},{4,6,5},{5,6,7}};
		
		for(int i=ro.length-1;i>=0;i--)
		{
			for(int j=ro.length-1;j>=0;j--)
				
			{
				System.out.print(ro[i][j]+" ");
			}
			System.out.println();
		}

	}

}
