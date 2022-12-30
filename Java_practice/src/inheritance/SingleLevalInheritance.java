package inheritance;

public class SingleLevalInheritance {

	public static void main(String[] args)
	{
		
		
		Child1 c = new Child1();
		
		c.scooty();  // calling non-static child properties using child1 class
		c.look();    // calling non-static mothers property using child class
		
		Child1.cycle();       // calling static child1  properties  using child1 class
		Child1.recepies();  // calling static mothers properties using child1 class
		
	}

}
