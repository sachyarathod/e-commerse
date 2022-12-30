package thisAndSuperClass;

public class B extends A

{

	   int x =9;  // global value of x from b class
	   
	
	public static void main(String [] args)
	{
		B d = new B();
		System.out.println(d.x);
		d.demo();
		
	System.out.println("value of x is "+d.x);
		
	}
	
	public void demo()
	{
		 int x = 900;
		 System.out.println("Local value of x "+x);
		 System.out.println("global value of x from class B "+this.x);
		System.out.println("the value of y is "+super.y);
		
	}
}
