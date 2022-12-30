package practice;

public class Study extends Demo2
{

	
	int a;
	int b;
	int m;
	String c;
	String d;
	char l;
	
	public static void main(String [] args)
	{
		
          Study s = new Study();
          s.demo();
          s.study3();
        Study S = new Study(30, 40,"sachin");
        
        S.demo1();
        
        Study st = new Study(15, 20, 21, 'M');
        st.demo2();
	}
	
	Study()
	{
		a=10;
		b=15;
		c="Sachin";
		
	}
	
	public void demo() 
	{
		
		int sum = a+b;
		System.out.println("sum is "+sum);
		System.out.println("name is "+c);
		
	}
	
         Study(int x,int y,String z)
         {
        	 
        	a =x;
        	 b=y;
        	 c=z;
        	 
        	 int add =a+b;
        	 System.out.println("add is "+add);
        	 System.out.println("name is "+c);
        	 
         }
	public void demo1()
	{
              
	   int mul = a*b;
	   System.out.println("mui is "+mul);
	   
	}
	
	Study(int p,int q, int r,char o)
	{
		
		a=p;
		b=q;
		m=r;
		l=o;
		
		
			
	}
	
	public void demo2() 
	{
		
		int sum =a+b+m;
		System.out.println("sum is "+sum);
		System.out.println(" gender is "+l);
	}
	
	
	public void study3()
	{
		int w=89;
		
		int sum = w+this.y;
		System.out.println(sum);
	}
	

}
