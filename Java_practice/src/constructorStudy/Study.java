package constructorStudy;

public class Study {

	public static void main(String[] args)
	{
		Study s = new Study();
		s.demo();
		
		Study s1 = new Study(122, 45);
		
		s1.demo2();
		
		Study s2 = new Study(24, "Sachin", 'A');
		
		s2.demo2();
	}
          
	   public Study()
	   {
		   int a = 12;
		   int b = 43;
		   
		   int mul = a*b;
		   System.out.println(mul);
		  
		   
	   }
	   int o;
	   String name;
	    char gender;
	   
	   public Study(int p,int q)
	   {
		   int add = p+q;
		   System.out.println("add is "+add);
	   }
	
          public void demo()
          { 
        	  int a = 12;
   		   int b = 43;
        	  int sum = a+b;
        	   System.out.println("the value of sum is "+sum);
          }
	public void demo2() 
	{
		  System.out.println("name is "+name);
		  System.out.println(" the value of o is "+o);
		  
		 
	}
	
	    public Study(int num,String num1,char num2) 
	    {
	    	 
	    	 o=num;
	    	  name=num1;
	    	 gender=num2;
	    	  
	    	  System.out.println("the value of o is "+num);
	    	  System.out.println("my name is "+num1);
	    	  System.out.println("my gender is "+num2);
	    	 
	    }
	
	
	
	
}
