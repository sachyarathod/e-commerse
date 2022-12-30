package interfacestudy;

public class Imp implements Study
{

	public static void main(String[] args)
	{
		
		Imp i = new Imp();
		i.demo();
		i.demo1();
	
		
	}

	@Override
	public void demo() {
	
		int mul = a*b;
		
		System.out.println("mul is "+mul);
		
	}

	@Override
	public void demo1() 
	{
		int sum = a+b;
		System.out.println("sum is "+sum);
		
	}

}
