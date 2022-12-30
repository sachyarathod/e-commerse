package abstractStudy;

public class Overload {

	public static void main(String[] args) 
	
	{
		Overload o = new Overload();
		o.study();
		o.study(20, "Sachin", 'A');

	}
      
	
	public void study() 
	{
		int a =12;
		String cityName = "pune";
		char div = 'A';
		
		System.out.println("the value of a is "+a);
		System.out.println("the cityName  is "+cityName);
		System.out.println("the div is "+div);

	}
	           
	   public void study(int a, String firstname,char div) 
	   {
		
		    System.out.println("the value of a is "+a);
		    System.out.println("the firstname is "+firstname);
		    System.out.println("the div is "+div);
		    	
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
