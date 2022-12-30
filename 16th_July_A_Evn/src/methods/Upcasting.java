package methods;

public class Upcasting 
{

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();

		c.car();
		c.money();
		c.degree();
		
		ParentClass p = new ParentClass();
		p.car();
		p.money();
		
		
		
		
		
		ParentClass p1 = new ChildClass();
		
		p1.car();
		p1.money();
		
		
	}

}
