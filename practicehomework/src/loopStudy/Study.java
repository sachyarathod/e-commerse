package loopStudy;

public class Study implements Demo
{
	
	public static void main(String[] args) 
	{
		
		
		Study s = new Study();
		
		Demo.demo();
		s.demo1();
		s.demo3();
		
		
		
	}
	
	

	@Override
	public void demo3() 
	{
		
		System.out.println("hi demo3 method running");
	}



	
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	   

}
