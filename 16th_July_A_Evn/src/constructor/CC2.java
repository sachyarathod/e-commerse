package constructor;

public class CC2 
{
   int a; // global variable declared
   int b; // global variable declared
   
   public CC2() // user defined zero parameter
   {
	  a =10;
	  b =12;
   }
   public CC2(int num,int num1) // user defined two parameter constructor
   {
	   a = num;
	   b = num1;
   }
   public static void main(String[] args) 
   {
	   CC2 c = new CC2();
	   c.add();
	   CC2 c1 = new CC2(100,12);
	   c1.add();
   }
   public void add() 
   {
	   int sum =a+b;
	   System.out.println("sum is "+sum);
   }
}
