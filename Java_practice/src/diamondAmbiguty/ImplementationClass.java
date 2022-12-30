package diamondAmbiguty;

public class ImplementationClass implements C,D
{

	public static void main(String[] args) 
	{
		D.demo();
		C.Demo();
		
		
		ImplementationClass i = new ImplementationClass();
		i.demo5();
		i.study();
	    i.study1();
	    i.study2();

		
		
	}
	
	    static  int a = 23;
	     int b = 24;
	      

	@Override
	public void study() 
	{
		int sum = a+b;
		System.out.println(sum);
		System.out.println("value of b is "+b);
	}

	@Override
	public void study1() 
	{
		b=334;
		System.out.println(b);
		
	}

	@Override
	public void study2() 
	{
		System.out.println("value of b is "+b);
		
	}

	@Override
	public void study3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study4() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Demo1() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo3() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo4() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo2() 
	{
		// TODO Auto-generated method stub
		
	}

	
	public void demo() 
	{
	
		
	}

	@Override
	public void demo5()
	{
		D.super.demo5();
		C.super.demo5();
	}

}
