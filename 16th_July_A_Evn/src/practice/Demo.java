package practice;

public class Demo {

	public static void main(String[] args)
	
	{
		Demo d = new Demo();
		d.study();
		Demo.study1();
		
		// create object of study class and call method of study class

		Study s =new Study();
		s.demo();
		s.demo1();
		s.demo();
		
		
		
		
	}
	
	int a=32;
	int b=2;
	
	public  void study()
	{
	//	int a=2;
		int c = this.a+b;
		System.out.println(c);
	}
	
	
	public static void study1()
	{
		// explicite casting convert lower type of data into higher type
		int a =34;
		double b=a;
		System.out.println(b);
		
		// implicite casting convert higher type of data into lower type
		double d=2;
		int c=(short)d;
		System.out.println(c);
	}
	
	
	
	
	
	
	

}
