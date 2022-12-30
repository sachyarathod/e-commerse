package practice;

public class Demo2 {

	public static void main(String[] args)
	{
		
		Demo2 d = new Demo2();
		d.demo();
	}
	
	int x =23;
	int y =43;
	
	public void demo()
	{
		int x= 23;
		int sum = x+this.x;
		System.out.println(sum);
	}

}
