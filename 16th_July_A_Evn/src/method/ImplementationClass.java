package method;

public class ImplementationClass implements Interface1,Interface2
{

	public static void main(String[] args) 
	{
	
		
		ImplementationClass i = new ImplementationClass();		
		        i.demo();
		        i.demo1();
		        i.demo2();
		
		
	}

	@Override
	public void demo() 
	{
		for(int i =2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		
	}

	@Override
	public void demo1() 
	{
		// i want to write my name 2 times
		
		int i =0;
		while(i<=2) 
		{
			System.out.println("Sachin");
			i++;
			
		}
		
	}

	@Override
	public void demo2()
	{
		
		// i want to write a table of 10 in reverse order
		int i =100;
		do 
		{
			System.out.println(i);
			i=i-10;
			
		}while(i>=10);
		
	}

	

	@Override
	public void demo3() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study1() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study2() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study3() {
		// TODO Auto-generated method stub
		
	}

}
