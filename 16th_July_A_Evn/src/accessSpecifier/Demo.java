package accessSpecifier;

public class Demo 
{
	
	public static void main(String [] args) 
	{
		
		Demo d = new Demo();
		
		d.test1();    // calling private access specifier from same class
		d.test2();   // calling default access specifier from same class
		d.test3();    // calling protected access specifier from same class
		d.test4();     // calling public  access specifier from same class
		
		System.out.println("calling private data member "+d.a);
		System.out.println("calling private data member "+d.b);
		System.out.println("calling private data member "+d.c);
		System.out.println("calling private data member "+d.e);

		System.out.println("===========================================");
	
		System.out.println(" the value of p is "+d.p);
		System.out.println(" the value of q is "+d.q);
		System.out.println(" the value of r is "+d.r);
		System.out.println(" the value of s is "+d.s);
		
	}
	
	
	private int a =10;
	int b =20;
	protected int c =30;
	public int e =40;
	
	
	private void test1()
	{
		System.out.println("calling private sccess specifier"+a);
	}
	
	 void test2()
	{
		System.out.println("calling default sccess specifier");
	}
	
	protected void test3()
	{
		System.out.println("calling procted sccess specifier");
	}
	
	public void test4()
	{
		System.out.println("calling public sccess specifier");
	}
	
	
	 private int p =12;
	  int q =10;
	  protected int r =30;
	  public int s =23;
	  
	
	

}
