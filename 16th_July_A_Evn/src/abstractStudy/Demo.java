package abstractStudy;

public class Demo {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		
		System.out.println("the sum is "+a+b);// sum is 30
		

	// double d =a;
		String s="100";
		String s1="200";
		
		// converting string data type into int using Integer (wapper) class // for double Double class
	    int as = Integer.parseInt(s1);
		 int d = Integer.valueOf(s);
	    
		 int sum = as+d;
		System.out.println(s+s1+sum);
		
	}

}
