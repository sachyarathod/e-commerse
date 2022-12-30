package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args)
	{
		
		Child1 c1 = new Child1();
		
		c1.bike(); // calling grandfather properties using child class 
		
		Child1.farm();  // calling grandfather properties using child class
		
		
		
		
	}

}
