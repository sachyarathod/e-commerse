package localAndGlobalVariable;

public class Study1 {

	
	
	           int P=5;  // non static global variable declaration
	    static int Q=6;  // static global variable declaration
	
	
	
	
	public static void main(String[] args)
	{
	
		// create object for non static global variable
		
		Study1 S = new Study1();
		System.out.println("the value of p is "+S.P); // calling non static global variable from same class
		System.out.println("the value of Q is "+Q);   // calling static global variable from same class
		
		int add=12+S.P; 
		System.out.println("the valiue of add id "+add); // calling non static global variable from same class
		
		int sub=14-Q;
		System.out.println("the value of sub is "+sub);
		
		System.out.println("===========================================");
		
		
		  S.addition();       // calling non static method from same class
		  multiplication();   // calling  static method from same class
		  
		  System.out.println("=====================================");
		 
		  Study1 SD = new Study1();
		  System.out.println("the value of n is "+StudyGlobalAndLocalVariable.n);
		  
	       StudyGlobalAndLocalVariable.method();  // calling static method from diff clas
	       SD.addition();
	}
	
	public void addition()
	{
		   int x=12;
		   int y=24;
		   int sum = x+y;
		   System.out.println("the value of sum is "+sum);
	}
     public static void multiplication()
     {
    	 int m=12;
    	 int n=50;
    	 int mul= m*n;
    	 
    	 System.out.println("the value of mul is "+mul);
    	 
    	 
     }
     
     
     
     
     
     
     
}
