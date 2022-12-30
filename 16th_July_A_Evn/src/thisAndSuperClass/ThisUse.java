package thisAndSuperClass;

public class ThisUse

{

	     int a = 100;  // global variable
	
	static int b = 10;
   
	public static void main(String [] args)
	{
		
		ThisUse t = new ThisUse();
		t.test();
		
	}

	public void test()
	{
		
	       int a =10;
		   System.out.println("Local variable value of a is "+a);
		   System.out.println("Global variable value of a is "+this.a);

	     int sum2 = 10+this.a;  // using global value of a
	     System.out.println("Sum is "+sum2);
	     
	     int sum1 = 10+a; // using local value of a 
	     System.out.println("Sum is "+sum1);
	     
	     System.out.println("==============");
	     
	  
		

	//	int b =10;
		
	     System.out.println("the value of b is "+b);
	     
		 int sum = this.a+ThisUse.b;
	       
	     System.out.println("sum is "+sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
