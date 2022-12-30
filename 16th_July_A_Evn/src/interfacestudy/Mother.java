package interfacestudy;

public interface Mother
{

	 void look();
	 void receipe();
	 default void love()
	 {
		 System.out.println("mothers love");
	 }
	 static void test() 
	 {
		 System.out.println("mothers test method");
	 }
	
	
	
	
	
}
