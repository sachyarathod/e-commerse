package loopStudy;

public class MethodOverload {

	 static public void main(String[] args) 
	{
		System.out.println("main method");

		MethodOverload m = new MethodOverload();
		
		m.main(23, "as");
		MethodOverload.main(23);
		MethodOverload.main(args);
		
	}
	 int a =34;
	public static void main(int a,String[] args)
	{
	
		System.out.println("data type int ");
		 
	}

	public void main( int a,String name) 
	{
		System.out.println("main method String");
	}
	public static void main( int a) 
	{
		

	}
	
	
	
}
