 package castingStudy;

public class ExplicitCasting {

	public static void main(String[] args)
	{
		
		// higher---->lower data type
		
		// memory size ----->decreasing / narrowing 
		
		// data loss ----> done 
		
		ExplicitCasting e = new ExplicitCasting();
		
		              e.demo();
		
              ExplicitCasting E = new ExplicitCasting(12," BE-Mechanical", 30);
		                        E.demo1();
		
		   double a = 1.123456678d;
		   
		   System.out.println(a);
		   
		   
		  float b  =(short) a;
		  System.out.println(b);
		
		double c = 23.84477d;
		
		int d = (short) c;
		
		System.out.println(d);
		
		double k = 67.35465d;
		int m =(short) k;
		System.out.println("the value of m is "+m);
		
		
	}    
	           int p ;
	           String className;
	           int q;
	           
	         public ExplicitCasting()
	         {
				
	        	 
	        	 p=12;
	        	 q=2;
	        	 className ="BE-Mechanical";
	        	 
	        	
	        	 
	      
			 }
	              public void demo()
	              { 
	            	  int div = p/q;
	 	        	 
	 	        	 System.out.println("div is "+div);
	            	 
	              }
	              
	          public ExplicitCasting(int num, String num2, int num1)
	          {
	        	     p = num;
	        	     q = num1;
	        	     className = num2;
	        	    
	          }
	         
	         public void demo1() 
	         {
	        	 int mul = p*q;
        	     System.out.println(" className is "+className);
        	    System.out.println("mul is "+mul);
	         }
	         

}
