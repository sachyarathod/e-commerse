package generalization;

public class HDFCbank implements RBIbank
{

	@Override
	public void deposite() 
	{
		System.out.println("HDFCbank money deposite");	
		
	}

	@Override
	public void withdraw() 
	{
		int a = 100;
		int b =200;
		System.out.println(a+b);
		
		
		System.out.println("HDFCbank money withdraw");	
		
	}

	@Override
	public void loan() 
	{
		System.out.println("HDFCbank loan");	
		
	}

}
