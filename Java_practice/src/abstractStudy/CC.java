package abstractStudy;

public class CC extends A

{

	public static void main(String[] args)
	{
		
		CC c = new CC();
		
		c.demo();
		c.demo1();
		c.study();
		c.study();
		c.study3();
		c.study();
		c.study4();
		
		B.demo3();
		
		
		
	}
	
	int a=12;
	int b=20;
	String name = "Sachin";
	char gender ='M';
	

	@Override
	public void study() 
	{
		System.out.println("gender is "+gender);
		int sum = a+b;
		System.out.println("the value of sum is "+sum);
		System.out.println("study method from A class");
		
	}

	@Override
	public void study1() 
	{
		System.out.println("study1 method from A class");
		
		
	}

	@Override
	public void study3() 
	{
		System.out.println("study3 method from B class");
		
	}

	@Override
	public void study4()
	{
		System.out.println("study4 method from B class");
		
		int mul = a*b;
		System.out.println(" mul is "+mul);
		
		System.out.println(" name is "+name);
	}

}
