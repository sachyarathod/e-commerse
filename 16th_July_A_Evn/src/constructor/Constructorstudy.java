package constructor;

public class Constructorstudy {

	
	int a;
	int b;
	public static void main(String[] args) 
	{
		
		Constructorstudy c = new Constructorstudy();
		c.sum();
		Constructorstudy c1 = new Constructorstudy(10, 67);

		c1.sum();
	}
	
	public Constructorstudy()
	{
		a=12;
		b=56;
	}

	public Constructorstudy(int a,int b)
	{
		int sum1=a;
		int sum2=b;
		System.out.println(sum1+sum2);
		
	}
	public void sum()
	{
		int sum =a+b;
		System.out.println(sum);
	}
}
