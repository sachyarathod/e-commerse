package inheritance;

public class HerarchicalInheritance {

	public static void main(String[] args)
	{
		
       Child1 c1 = new Child1();
       
       c1.look(); // calling mothers properties using child1 class
	
       Child1.recepies();
       
       System.out.println("============================");
		
       Child2 c2 = new Child2();
       
       c2.look();      // calling mothers properties using child class
       
       Child2.recepies();
    	   
       
       
	}

}
