package inheritance;

public class B extends A
{
	int a=10;

	public static void main(String[] args)
	{
		B.m();
		B.m();
		// create object of B class
		B b = new B();
		b.m1();
		int c=20;
		
		A.m();
	

	}
	public  void  m1()
	{
		System.out.println("method m1 of B class"+this.a);
	}
	
	public static void m()
	{
		System.out.println("method m of B class");
	}
	
	
	public String  m3(String sachin )
	{
		return sachin;
		
	}
	
	
	
	
	
	
	
	
	

}
