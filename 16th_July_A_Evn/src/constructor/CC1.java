package constructor;

public class CC1 {

	
	int a;
	int b;
	
	
     public  CC1() // user defined constructor with zero parameter
     {
    	 System.out.println("Hi i am constructor");
    	 a =9;
    	 b =8;
    	 
     }
 	public static void main(String[] args)
 	{
 		CC1 c=new CC1();
 		c.addition();
 		
 		CC1 c1 = new CC1(535, 15);
 		
 		
 		c1.demo();
 		
 		
 		
 		
 	}
 	
 	public void addition()
 	{
 		int sum = a+b;
 	System.out.println(" Addition is "+sum);	
 			
 	}
 	
 	  public CC1(int p,int q) 
 	  {
 		 
 		  
 		  int div = p/q;
 		  System.out.println("the value of div is "+div);
 	  }
 	
 	
 	
 	 public void demo() 
 	 {
 		 
 		 a=12;
 		 b=21;
 		 
 		 int mul =a*b;
 		 System.out.println("the value of mul is "+mul);
 		 
 	 }
 	
 	
 	
 	
 	
}
