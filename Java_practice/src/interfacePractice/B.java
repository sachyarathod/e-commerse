package interfacePractice;

public interface B  
{
	
	  void test();
	  void test1();
	  void test2();
	  
	  default void demo4()
	  {
		  
		  int p =20;
		  int q =56;
		  String name = "Sachin";
		  int add = p+q;
		  
		  System.out.println("add is "+add);
			  
		  System.out.println("my name is "+name);
		  
	  }
	

}
