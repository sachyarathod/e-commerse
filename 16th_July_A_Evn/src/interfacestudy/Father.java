package interfacestudy;

public interface Father 
{
	
	
	  void farm();
	  void money();
	  default void love() 
	  {
		  System.out.println("fathers love");
	  }
  
	  static void test() 
	  {
		  System.out.println("fathers test method");
	  }
	 
	  
}
