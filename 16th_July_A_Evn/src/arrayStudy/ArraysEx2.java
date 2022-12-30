package arrayStudy;

import java.util.Arrays; 

public class ArraysEx2 {

	public static void main(String[] args) 
	{
		
		// array declaration 
		
	//	int RollNom[] = new int[6];  // RollNom is object of array
		
		
		// array declaration and initialization in one line
		int Number[] = {50,30,20,40,60};
		
		
		for(int i =0;i<=Number.length-1;i++) 
		{
			System.out.println(Number[i]);
		}
		System.out.println("using dynamic for loop print Numbers");
		
		System.out.println("=================================");
		
		// how to use sort		
		
		Arrays.sort(Number);
		
		System.out.println("arrays in ascending order");
	
		for(int i =0;i<=Number.length-1;i++) 
		{
			System.out.println(Number[i]);
		}
		
		System.out.println("=======================");
		
		
		System.out.println("arrays in descending order");
		
		for(int i=Number.length-1;i>=0;i--) 
		{
			System.out.println(Number[i]);
		}
		
		char Gender[] = {'A','H','R','D'};
		
		Arrays.sort(Gender);
	
		    for(int i =0;i<=Gender.length-1;i++)
		    {
		    	System.out.println(Gender[i]);
		    }
                         
		 System.out.println("arrange gender in desending order");   
		    
		  for(int i =Gender.length-1;i>=0;i--)
		  {
			  System.out.println(Gender[i]);
		  }
		    
		    
		    System.out.println("arrange gender in asending order");
		    
		    for(int i=0;i<=Gender.length-1;i++) 
		    {
		    	System.out.println(Gender[i]);
		    }
		    
		    float height[] = {5.56f,6.45f,7.2f,4.99f};
		    
		    // array traverse using static for loop
		    
		    for(int i=0;i<=3;i++)
		    {
		    	System.out.println(height[i]);
		    }
		    
		    // array traverse using dynamic for loop 
		    
		    System.out.println("================================");
		    for(int i=0;i<=height.length-1;i++) 
		    {
		    	System.out.println(height[i]);
		    }
		    
		      // use of sort method 
		    
		    Arrays.sort(height);
		    
		    System.out.println("arrange height in asending order");
		    
		    for(int i =0;i<=height.length-1;i++) 
		    {
		    	System.out.println(height[i]);
		    }
		    
		    System.out.println("=====================");
		    
		    System.out.println("arrange height in desending order");
		    
		      for(int i =height.length-1;i>=0;i--) 
		      {
		    	  System.out.println(height[i]);
		      }
	}

}
