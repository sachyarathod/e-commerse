package controlStatement;

public class IfElse {

	public static void main(String[] args)
	{
        //  if temperature is greater than 28.9 turn on AC else turn off AC
		
		float Temp=28.9f;
		if(Temp>28.9)
		{
		System.out.println("Turn on AC");
		}
		else 
		{
			System.out.println("Turn off Ac");
		}
	// if city name is Pune then visit to shanivarVada else you are not in pune
		
		String City="Pune";
	if(City=="Pune")
	     { 
	    	 System.out.println("visit to shanivarvada");
	     }
	     else
	     {
	    	 System.out.println("you are not in pune");
	     }
	// if gender is M then i am male else i am female
	
	    char gender='M';
	   if(gender=='M')
	   {
		   System.out.println("i am male");
	   }
	   else 
	   {
		   System.out.println("i am female");
	   }
	   
	   
	      // if im in village  visit hanuman colony otherwise not in village
	   
	         String name ="dagadwadi";
	        if (name == "dagadwadi") 
	        {
	        	System.out.println("visit to hanuman colony");
	        }
	        else
	        {
	        	System.out.println("im not in village");
	        }
	}

}
