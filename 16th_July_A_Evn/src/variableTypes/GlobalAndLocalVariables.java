package variableTypes;

public class GlobalAndLocalVariables
{
	   int a=100; //  non-static global variable declaration
	   int b=12;   //  non-static global variable declaration
	  static int c=18; // static global variable declaration
	   
	public static void main(String[] args)
	{
		test1(); // calling static method from same class
		GlobalAndLocalVariables GV = new GlobalAndLocalVariables(); // created a object for same class
		GV.test();
		System.out.println("Global value of a is "+GV.a); // calling non-static variable from same class
	System.out.println("Global value of c is "+c); // calling global variable from same class
		int add = 22+c;   // calling static global variable from same class
		System.out.println("Addition is "+add);
		System.out.println("=============================================");
		
	StudentInfo Si = new StudentInfo(); // calling non static method from different  class 
	Si.test();
	
	StudentInfo.test1();  // calling static method from different class 
		
		System.out.println("==============================");
		

		
	}
	public void test()
	{
	 int a=90;
	 int b=12;
	 int sum = a+b;
	 int add =a+12;
	 System.out.println("Sum is "+sum);
	 System.out.println("add is "+add);
	 System.out.println("Running non static method test");
	}
	public static void test1()
	{
		System.out.println("Running static method test1");
	}
}
