
public class CC extends Inheritance1

{

	public static void main(String[] args) 
	
	{
		CC c = new CC();
		
		c.child1();
		c.child();
		
		c.child3();
		c.child4();
		c.child2();
		inheritance.mother();
	
		System.out.println("==============================================");
		
		  
		
		
	}

	@Override
	public void child1()
	{
		String name = "sachin";
		char gender = 'M';
		int rollNumber = 123;
		float height = 5.54f;
		double weight = 62.123456d;
		
		System.out.println("name is "+name);
		System.out.println("gender is "+gender);
		System.out.println("rollNUmber is "+rollNumber);
		System.out.println("height is "+height);
		System.out.println("weight is "+weight);
		
		
		System.out.println("child 1 method from interface 1");
		
	}

	@Override
	public void child2() 
	{
		System.out.println("child 2 method from interface 1");		
	}

	@Override
	public void child3()
	{
		System.out.println("child 3 method from interface 1");
		
	}

	@Override
	public void father() 
	{
		System.out.println("father  method from interface ");
		
	}

	@Override
	public void son()
	{
		System.out.println("son method from interface ");
		
	}

	@Override
	public void child()
	{
		System.out.println("child  method from interface ");
		
	}
	
	             public void demo1()  // method overload concept
	             {
	            	   int a =10;
	            	   int b =40;
	            	   int mul = a*b;
	            	   System.out.println("mul is "+mul);
	            	   
	             }
	                 int p;
	                 int q;
	                 int r;
	         public void demo(int num, int num1,int num3)   // method overload concept
	         {
	        	 
	        	    p= num1;
	        	    q= num1;
	        	    r= num3;
	        	    
	        	 int sum = p+q+r;
	        	 System.out.println(" the value of sum is "+sum);
	        	 
	        	 
	         }

}
