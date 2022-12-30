package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args)
	
	{
		
		Daughter.scooty(); // daughters class calling its own property
		Daughter.look();   // daughters class calling mothers static method
		
		
		Daughter D = new Daughter();
		D.mobile();      // using object of daughter class,calling daughters property
		
	     D.receipe();  // using daughters class calling mothers non static property
	}

}
