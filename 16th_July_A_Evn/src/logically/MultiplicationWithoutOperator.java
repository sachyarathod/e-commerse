package logically;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		
		int a = 3;
		int b = 5;
		
		int mul = 0;
		for(int i=1;i<=a;i++)
		{
			mul=mul+b;
		}
		System.out.println(mul);

		
		int c =12;
		int d =6;
		
		// i want to multiply both numbers but without using multiplication operator 
		int mul1 =1;
		for(int i = 1;i<=d;i++)
		{
			mul1 = mul1+c;
		}
		System.out.println(mul1);
		System.out.println("=========================");
		
		// i want do additation of two numbers 
		int p =12;
		int q =12;
		int r =0;
		
		for(int i =1;i<=p;i++)
		{
			r = r+q;
		}
		System.out.println(r);
	}

}
