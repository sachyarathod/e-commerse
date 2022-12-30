package interfacePractice;

public interface A
{
	
	   void demo();
	   void demo1();
	   void demo3();
	   
	   
	    default void demo4() 
	    {
	    	
	    	 
	  		   int a=20; int b =45;
	  		   
	  		   int mul =a*b;
	  		   
	  		    System.out.println("mul is "+mul);
	  	  
	    }
	  
	
	 

}
