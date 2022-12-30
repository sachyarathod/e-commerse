package castingStudy;

public class ImplicitCasting {

	public static void main(String[] args) 
	{
		
		// lower------>Higher
		
		// memory----->Increases / widening Casting		
		
		// data loss --->no
	
		
		  int a = 12;
		  
		  System.out.println(a);
		  
		 double b=a;
		 
		 System.out.println(b);
		
		 
		 int d = 53;
		 
		 System.out.println(d);
		 
		 double c = d;
		 System.out.println(c);
		 
		 int x =12;
		 
		 double y = (int)x;
		 
		 System.out.println(y);
		 
		 double m=12.76656356d;
		 
		 int n=(int)m;
		
		 System.out.println(n);
	}

}
