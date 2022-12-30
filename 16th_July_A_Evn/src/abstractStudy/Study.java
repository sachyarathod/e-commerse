package abstractStudy;

public abstract  class Study {

	public static void main(String[] args)
	{
	
		//     Study s = new Study(); can not create object of abstract class
		
		 //     s.demo();
		
	}

	 abstract void demo();
	  
	 
	  public  void demo1()
	  {
		
		  System.out.println("i am a demo1 method");
	  }
	
	   public void demo2()
	    {
	    
	    	int i =2;
	    	int j = 32;
	    	int sum = i+j;
	    	
			System.out.println(sum);
	   	
	    }
	
}
