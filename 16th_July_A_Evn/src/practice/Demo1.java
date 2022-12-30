package practice;

public class Demo1 {

	public static void main(String[] args)
	{
		
		//Demo1 d = new Demo1()
		Demo1 d1 = new Demo1(12);
		d1.demo();

	}
	
	int a;
	int b;
	String c;
	Double d;
	char e;
	
	Demo1()
	{
		a=2;
		b=3;
		c="Sachin";
		d=5.56d;
		e='M';
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		
	}
	
	public void main()
	{
		int c= a+b;
		
		int v=(int) (d+(short)a);
		System.out.println(v+c);
	}
	
	
	   private Demo1(int g)
	{
		g=64;
		System.out.println(g);
	}
	
	   public void demo()
	   {
		   System.out.println();
	   }

}
