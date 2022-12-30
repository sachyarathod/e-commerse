package interfacePractice;

public class ABC implements A,B
{

	public static void main(String[] args) 
	{
		
		ABC A = new ABC();
		
		A.demo();
		A.demo1();
		A.demo3();
		
		System.out.println("===============");
		
		
		A.test();
		A.test1();
		A.test2();
		
		A.demo4();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo4()
	{
	
		A.super.demo4();
		
	}

	
	
       
}
