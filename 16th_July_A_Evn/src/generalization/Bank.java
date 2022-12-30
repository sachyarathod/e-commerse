package generalization;

public class Bank 
{

	public static void main(String[] args) 
	{
		
		SBIbank s = new SBIbank();
		HDFCbank h = new HDFCbank();
		
		s.withdraw();
		s.deposite();
		s.loan();
		
	System.out.println("=========================");
	
	     h.withdraw();
	     h.deposite();
	     h.loan();
		
		
		
	}

}
