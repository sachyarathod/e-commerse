package loopStudy;

public interface Demo
{
	
	   static void demo() 
	   {
		   System.out.println("static method");
	   }
	
	  default void demo1()
	{
		  System.out.println("default method");
	}
	
	
	void demo3();
	
	
	
	

}
