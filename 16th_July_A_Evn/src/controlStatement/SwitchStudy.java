package controlStatement;

public class SwitchStudy 

{
     
	public static void main(String[] args) 
	{
		
		// i want to store my marks grade
		// A---->8--10
		// B---->6--8
		// C---->4--6
		// failed
		
		
		char gender= 'B';
		switch (gender) {
		case 'A': System.out.println("your mark  range is 8--10");
		break;
		
		case 'B' : System.out.println("your mark  range is 6--8");
		break;
		
		case 'C' :  System.out.println("your mark  range is 4--6");
		break;

		default: System.out.println("you are faile");
			break;
		}
		
		System.out.println("=============================");
		
		// i want to store my city name 
		// mumbai
		// pune 
		// parbhani
		// gangakhed
		
		
		String city="gangakhed";
		switch (city) {
		case "mumbai": System.out.println(" you are in mumbai");
		break;
		
		case "pune": System.out.println(" you are in pune");
		break;
		
		case "parbhani": System.out.println(" you are in parbhani");
		break;
		
		case "gangakhed" :System.out.println(" you are in Gangakhed");
		break;

		default:
			break;
		}
		  
		
		String name = "Sachin";
		
	  switch (name) {
	case "Sachin":  System.out.println("my name is Sachin");
		break;

	default:
		break;
	}
	}
	
	
	
       
}
