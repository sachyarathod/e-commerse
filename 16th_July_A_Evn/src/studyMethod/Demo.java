package studyMethod;

public class Demo {

	   int a=13;  // global variable deceleration
	
	
	public static void main(String[] args)
	{
	
		// how to call public static method from same class 
		// methodeName();
		m(); // calling static regular method from same class
		PuneUniversity.student();
		PuneUniversity Pu = new PuneUniversity();
		Pu.studentinfo();
		Demo D = new Demo();
		D.s();
		System.out.println("==========================================");
		
		Demo d = new Demo();
	System.out.println("the value of sum is "+d.a);
		
	
		
	}
	// regular static method complete
   public static void m()
{
	System.out.println(" Hi am a static method");
}
public  void s()
{
	System.out.println(" above all infrormation is all about me");
	
}
}
