package polymorphysm;

public class MethodOverloading
{
	
	
	public static void main(String [] args)
	{
		
		
		MethodOverloading s = new MethodOverloading();
		
		s.demo();
		s.demo(12, 10);
	    s.demo(12, 34, 56);
		
	}
	
	public void demo() 
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		System.out.println("sum is "+sum);
	}
	
	public void demo(String Sachin ,double d) 
	{
		
	}
	public void demo(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum is "+sum);
	}
	
	   public void demo(int s,int p,int r)
	   {
		   int add = s+p+r;
		   System.out.println(add);
	   }
	
	
	
	
	
}
