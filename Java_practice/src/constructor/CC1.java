package constructor;

public class CC1 {

	
	float a;
	float b;
	float c;
	float d;
	
	public CC1()    // constructor with zero parameter
	{
		a =2.3f;
		b =2.5f;
		c =22;
		d =11;
		System.out.println(" Hi i am constructor with zero parameter");
	}
	
	public CC1(float num) // constructor with one parameter
	{
		num = c;
		System.out.println("Hi i am constructor with one parameter");
	}
	public CC1(float num ,float num1,float num2) // constructor with three parameter
	{
		a = num;
		b = num1;
		c = num2;
	}
	public CC1(float num ,float num1,float num2,float num3) // constructor with four parameter
	{
		a = num;
		b = num1;
		c = num2;
		d = num3;
	}
	
	public static void main(String[] args)
	{
		CC1 c = new CC1();
		c.add();
		CC1 c1 = new CC1(22);
		c1.sub();
		CC1 c2 = new CC1(1.5f,10.3f, 2.5f, 2);
		c2.add();
		CC1 c3 = new CC1(1.5f,10.3f, 2.5f);
		c3.sub();
	}

	public void add()
	{
		float sum = a+b+c+d;
		System.out.println("Sum is "+sum);
	}
	public void sub()
	{
		float sub = c-d;
		System.out.println("Sub is "+sub);
	}
}
