package generalization;

public class SBIbank implements RBIbank

{

	@Override
	public void deposite()
	{
		System.out.println(" SBIbank money deposite");
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println(" SBIbank money withdraw");		
	}

	@Override
	public void loan()
	{
		System.out.println(" SBIbank loan");	
		
	}

}
