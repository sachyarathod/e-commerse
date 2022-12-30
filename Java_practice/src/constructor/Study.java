package constructor;

public class Study {

	public static void main(String[] args) 
	{
 
		Study s = new Study();
		s.test();
		
		Study s1 = new Study(23,76);
		s1.test();
	}

int a ;
int b;

   Study()
{
  a =12;
  b= 32;

int sum = a+b;
 System.out.println("the value of sum is "+sum);
}
public Study(int num ,int num1)
{
     a=num;
     b = num1;

   int add = a+b;
   System.out.println("add is "+add);


}

   public void test()
{
    
   int mul = a/b;
      System.out.println(mul);


}
}
