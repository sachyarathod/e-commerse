package method;

public class ConcreatClass extends Practice
{

	public static void main(String[] args)
	{
		ConcreatClass c = new ConcreatClass();
		c.demo();
		c.demo();
		c.demo();
		
		
		
		
		
		

	}

	@Override
	public void demo() 
	{
		System.out.println("print name");
		
	}

	@Override
	void demo1()
	{
		System.out.println("surname");
		
	}

	@Override
	public void demo2()
	{
		System.out.println("sachin");
		
	}

}
