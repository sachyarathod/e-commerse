package diamondAmbiguty;

public interface D 
{
	
	   public void study();
	   public void study1();
	   abstract void study2();
	   public void study3();
	   public void study4();
	   
	   static  void demo() 
	   {
			   // i want to print 3 table
			   
			   for(int i =3;i<=30;i=i+3)
			   {
				   System.out.println(i);
			   }
			   
	    	}
		
	  
	default void demo5() 
	{
		System.out.println("interface D demo method");
	}
	
	
	

}
