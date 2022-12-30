package accessSpecifier;

public class Demo {

	public static void main(String[] args)
	
	{
		Demo d = new Demo();
		
		d.study();  // calling private static method from same class
		d.study1();
		d.study2();
		d.study3();
		
		
		
		
	}
	   // declaration of private, default, protected,public 
	
	private int a =10;
	int b = 20;
	protected int c =30;
	public int d = 40;
	
	
	private void study() 
	{
		System.out.println("calling private method"+a);
	}
	
      final void study1() 
     {
	     System.out.println("calling default method");
     }
     
     protected void study2() 
     {
    	 System.out.println("calling protected method");
     }
     
     public void study3()
     {
    	 System.out.println("calling public method");
     }
     
     
}
