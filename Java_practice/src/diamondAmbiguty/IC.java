package diamondAmbiguty;

public class IC implements A,B

{

	public static void main(String[] args)
	{
		
		IC i = new IC();  // create object of IC class 
		
		i.study();
		i.study1();  // calling override method with i object
		i.study2();
		i.study3();
		
		i.love();
		
		B.love();  // calling static love method from B interface

	}
	
	int a=10;
	int b=45;
	

	@Override
	public void study2() 
	{
		System.out.println("study2 method from B interface");
		
	}

	@Override
	public void study3()
	{
		int add = a+b;
		System.out.println("the value of add is "+add);
		
		
		System.out.println("study3 method from B interface");
		
	}

	@Override
	public void study()
	{
		System.out.println("study method from A interface");
		
	}

	@Override
	public void study1()
	{
		System.out.println("study1 method from A interface");
		
		int mul =a*b;
		
		System.out.println("mul is "+mul);
	}

	@Override
	public void love()
	{
		  A.super.love();
		
	}

}
