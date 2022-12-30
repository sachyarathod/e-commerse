package interfacestudy;

public class IC2 implements Interface3,Interface4
{

	public static void main(String[] args)
	
	{
		
		IC2 I = new IC2();
		
		I.test();
		I.test1();
		I.test2();
		I.test3();
		I.test4();
		
		
         Interface3.test5();
         Interface4.test5();
	
	}

	@Override
	public void test3()
	{
		System.out.println("interface3 test3 method");
		
	}

	@Override
	public void test4() 
	{
		System.out.println("interface3 test4 method");		
	}

	@Override
	public void test1()
	{
		System.out.println("interface4 test1 method");		
	}

	@Override
	public void test2() 
	{
		System.out.println("interface4 test2 method");
		
	}

	@Override
	public void test()
	
	{
		Interface3.super.test();
		Interface4.super.test();
		
	}

}
