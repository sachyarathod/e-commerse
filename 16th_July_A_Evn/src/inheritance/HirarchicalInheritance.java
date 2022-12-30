package inheritance;

public class HirarchicalInheritance {

	public static void main(String[] args) 
	
	{
		
		
		Mother m = new Mother();
		Child1 c = new Child1();
		Child2 C = new Child2();
		
		
		m.receipe();
		
		c.books();
		c.receipe();
		
		C.phone();
	    C.receipe();
		
		
		
		System.out.println("==================================");
		
		
		Mother.look();
		
		
		Child1.pen();
		Child1.look();
		
		Child2.cycle();
		Child2.look();
		
		
		
		
	}

}
