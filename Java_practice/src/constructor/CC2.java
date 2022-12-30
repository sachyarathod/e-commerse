package constructor;

public class CC2 {

	public static void main(String[] args) 
	
	{
	      test();
	      
          CC2 c=new CC2();
          c.add();
         
          CC2 c1 = new CC2(110);
          c1.add();
         
	}

	
	public static void test() 
	
	{
		 int a =12;
		 float b = 1.345f;
		 char gender = 'm';
		 String name = "Sachin";
		 
		 System.out.println("name is "+name);
		 System.out.println("gender is "+gender); 
		 System.out.println("the value of a is "+a);
		 System.out.println("the value of b is "+b);
		
	}
	
	public CC2() 
	{
		int p =10;
		int q =20;
		
		int sum = p+q;
		
		System.out.println("The sum is"+sum);
		
		
	}
	
	
	public  CC2(float num)// constructor with one parameter
	{
	
		num = 'c';
		System.out.println("Hi i am constructor with one parameter");
	}
	
	public  void add()
	{
		float add =10+'c';
		System.out.println("the value of add is "+add);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
