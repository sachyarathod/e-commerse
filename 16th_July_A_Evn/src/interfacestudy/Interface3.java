package interfacestudy;

public interface Interface3 
{
	
	
	void test1();
	void test2();
	default void test() 
	
	{
		System.out.println("Interface3 test method");
		
	}
	
      static void  test5() 
     {
    	  System.out.println("Interface3 test5 method");
     }
}
