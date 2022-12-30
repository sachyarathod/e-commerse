package accessSpecifier1;


import accessSpecifier.Demo;

public class Demo2 extends Demo

{

	public static void main(String[] args)
	
	{
		
		Demo d = new Demo();
		
	//	d.test1(); private member access only within class
		
	// d.test2();  default member access only within package only
	// d.test3();	procted member access only within package and using inheritance concept we can call
		
		
		
		d.test4(); // public member access within project

		Demo2 d2 = new Demo2();//  creating object of a subclass
		
	    d2.test3();  // calling protected method from another class using inheritance
	    d2.test4();  // calling public method from another class 
		
	    
	 //   System.out.println(" the value of p is "+d.p);
	 //     System.out.println(" the value of p is "+d.q);
	    
	    
	    System.out.println(" the value of r is "+d2.r);
	    System.out.println(" the value of s is "+d2.s);
	    
	    
	    
	 // Implicit casting    
	      int a = 12;
	      double b =a;
	      
	      System.out.println(b);
	      
	    
	    // explicit casting
	      
	      double p = 23.6377636d;
	      
	     float r =(float) p;
	      System.out.println(r);
	      
	      float o=(short) p;
	      
	      // explicit casting 
	      
	      float c= 32.63442f;
	      
	      int s=(int ) c;
	      
	      System.out.println(s+o);
	    
	    
	    
	}

}
