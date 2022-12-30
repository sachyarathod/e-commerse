package accessSpecifier;

public class Demo1 {

	public static void main(String[] args)
	
	{
		
		Demo D = new Demo();
		
	//	D.test1();   can't access private member from another class
		D.test2();    // calling default method in another class
		D.test3();
		D.test4();
		
	//	System.out.println("calling default data member from another class "+D.a);  can't call private member from another class
		System.out.println("calling default data member from another class "+D.b);
		System.out.println("calling private data member from another class "+D.c);
		System.out.println("calling public data member from another class "+D.e);
		
		
		
		System.out.println(" the value of q is "+D.q);
		System.out.println(" the value of r is "+D.r);
		System.out.println(" the value of s is "+D.s);
		
	}

}
