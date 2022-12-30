package localAndGlobalVariable;

public class StudyGlobalAndLocalVariable {

	
	      int m =12;  // non static global variable 
	static int n=10;   //  static global variable 
	
	
	
	public static void main(String[] args)
	
	{  

		method();   // calling  static method from same class
		StudyGlobalAndLocalVariable SG = new StudyGlobalAndLocalVariable();
		SG.method1();
		
		System.out.println(n); // calling static global variable from same class
		System.out.println(SG.m);  // calling non static global variable from same class
	}
     public static void method()
     {
    	  int a=50;
    	  int b=20;
    	  int sum =a+b;
    	  System.out.println("the sum is "+sum);
     }
     
     public void method1()
     {
    	 int c=15;
    	 int d=20;
    	 int sub =d-c;
    	 System.out.println("the value of sub is "+sub);
     }
}
