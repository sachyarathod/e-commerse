package accessSpecifier1;

import accessSpecifier.Demo;

public class Demo2 extends Demo

{

	public static void main(String[] args) 
	
	{
	
		Demo d2 = new Demo();
		
		d2.study3();
		
		System.out.println("=======================");
		
		Demo2 d1 = new Demo2();
		
		d1.study2();  // calling protected method from another package using inheritance concept
		d1.study3();  // you can call public method through the class
		
		System.out.println("the value of c is "+d1.c);
		
	}

}
