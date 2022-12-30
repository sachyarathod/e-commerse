package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args)

	{
		
		GrandFather g = new GrandFather(); // create object of a grandfather class
		Father f = new Father();
	    Son s = new Son();
		
		g.nature();
		
		f.money();
		f.nature();
		
		s.bike();     // calling non-static method from different class
		s.money();
		s.nature();
		
		
		System.out.println("====================================");
		
		GrandFather.colour();
		
		Father.farm();
		Father.colour();      // calling static method from different class
		
		Son.mobile();
		Son.farm();
		Son.colour();
		
		
	}

}
