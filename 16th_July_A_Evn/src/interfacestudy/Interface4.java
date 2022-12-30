package interfacestudy;

public interface Interface4

{
	
	  void test3();
	  void test4();
	  default void test() 
	  {
		  
		  System.out.println("Interface4 test method");
		  
		  
	  }
              static void test5()
              {
            	  
            	  System.out.println("Interface4 test5 method");
              }
}
