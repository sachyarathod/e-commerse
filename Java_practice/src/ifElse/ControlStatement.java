package ifElse;

public class ControlStatement {

	public static void main(String[] args) 
	{
		
		
		// if else 
		// if i am in Dagadwadi then visit farm otherwise not visit to farm
		
		String village = "Dagadwadi";
		
		if(village =="Dagadwadi") 
		{
			System.out.println("visit to farm");
		}
		else 
		{
			System.out.println("i am not in gdagadwadi");
		}
		
       
		// if i am in pune then visit to dagadushet temple otherwise not in pune
		
		String cityName = "Pune";
		
		if(cityName =="Pune") 
		{
			System.out.println("visit to DagaduShet temple");
		}
		else 
		{
			System.out.println("I am not in pune");
			
		}
		
		
		// i want to print my marks 
		//  above 35 marks then pass
		// above 45 marks then pass third class 
		// above 55 marks then pass with 2nd class
		// above 65 marks then pass with 1st class
		// above 75 marks then pass with distinction
		
		int marks =67;
		
		if(marks<40) 
		{
            System.out.println("only pass");			
		}
		else if(marks<55) 
		{
			System.out.println("pass with 3rd class");
		}
		else if(marks<65) 
		{
			System.out.println("pass with 2rd class");
		}
		else if(marks<75) 
		{
			System.out.println("pass with 1rd class");
		}
		else if(marks>75) 
		{
			System.out.println("pass with  distinction");
		}
		
		else 
		{
			System.out.println(" i am fail");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
