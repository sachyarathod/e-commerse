package methods;

public class Sample {

	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.demo();
		s.demo(23,12);
		
	}

	
	
	public void demo() 
	{
		int p =12;
		int q =32;
		int add =p+q;
		System.out.println("the value of add is "+add);
		
		
	}
	
	public void demo(int a,int b) 
	{
		
		int mul = a*b;
		System.out.println("the value of mul is "+mul);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
