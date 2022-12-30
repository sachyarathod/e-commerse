package interfacestudy;

public class IC1 implements Interface2
{

	public static void main(String[] args) 
	{
		
		
		IC1 i = new IC1();
		
		i.demo1();
		i.demo2();
		i.demo3();
		i.demo4();
	
		
	}

	@Override
	public void demo1() 
	{
		System.out.println("interface1 demo1 method");
		
	}

	@Override
	public void demo2()
	{
		System.out.println("interface1 demo2 method");
		
	}

	@Override
	public void demo3() 
	{
		System.out.println("interface2 demo3 method");
		
	}

	@Override
	public void demo4() {
		System.out.println("interface2 demo4 method");
		
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo5() {
		// TODO Auto-generated method stub
		
	}

}
