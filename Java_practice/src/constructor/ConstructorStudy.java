package constructor;



public class ConstructorStudy {
   
	public static void main() 
	{
		
	}
	public static void main(String[] args) 
	{
		
		ConstructorStudy c = new ConstructorStudy();
		     c.demo();
		     
		     
		ConstructorStudy c1 = new ConstructorStudy(34,53.645f);
		
		     c1.demo();
	}
          int a ;
          double b;
      static float c;
	
	   public ConstructorStudy() 
	    {
	    	 String name = "sachin";
	    	 
	    	 int i = 50;
	    	 int j = 36;
	    	 int sum = i+j;
	    	 
	    	 System.out.println("my name is "+name);
	     System.out.println("sum is "+sum);
	    }
	
	public void demo() 
	{
		a=12;
		b=23.3d;
		c=4.7464f;
		
		  int sum = (int) (a+b+c);
		  
		  System.out.println(sum);
	}
	
	
	
	public  ConstructorStudy(int num,float num1) 
	{
		   a=num;
	       c=num1;
		   
		   
		   
		   System.out.println("value of a is "+a);
	}
	
	
	
	
	
	
}
