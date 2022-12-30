package Variable_study;

import accessSpecifier.Demo;

public class variablesClass extends Demo
{
	
	
	
	public static void main() 
	{
		System.out.println("a");
	}	
	
	
	
	public static void main(String[] args)
	
	{
		
		variablesClass.main();
		// i want to run roll num of syudent
		// 1. variable declaration (allocating/reserving memory)
		
	int rollNumber;
	
	//2. variable initialization (assigning inserting value)
	
	rollNumber=100;
	
	//3.usage
	
	
	System.out.println(rollNumber);
	System.out.println("rollNumber");
	System.out.println("rollNumber is "+rollNumber);
	
	
	
	     for(int i=1;i<=10;i=i+2) 
	     {
	    	 System.out.println(i);
	     }
	
	
	     int i=10;
	     while(i<=50) 
	     {
	    	  System.out.println(i);
	    	  i=i+5;
	     }
	             int j=10;
	     do {
	    	 System.out.println(j);
	    	 j++;
	     }while(j<=20)
;	
	
	
	System.out.println("==============================================");
	
	
	           Demo d = new Demo();
	           
	              d.test4();
	}
	
	
	
	
}
