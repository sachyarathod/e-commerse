package studyMethod;

public class Sample {
	
	
	
	  
	

	public static void main(String[] args)
	{
	
		
		
		Demo d = new Demo();
		System.out.println("the value of a is "+d.a);
		
		PuneUniversity pu = new PuneUniversity();
		pu.studentinfo();
		
		
		
		mathoperation();
		
		
	}
      // complete method ---> method have a declaration as well as definition
	
	public void test() // method declaration
	
	{
		 // body---> definition
	}
	public static void talk()
	{
		
	}
	// incomplete method --> method have declaration only dont have definition 
	// public void test(); // method declaration
	public static void mathoperation()
	{
		int a;
		int b;
		int c;
		a =10;
		b =20;
		c = a+b;
		System.out.println("The value of C is "+c);
		
		
	}
	}
