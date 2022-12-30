package abstractStudy;

public class CC extends Study
{

	 static public void main(String[] args)
	{
		CC c = new CC();
		c.demo();
		c.demo1(23,6);
	
		c.demo2();
		
	}
      
       public void demo1(int a, int b) 
       {
    	   
    	   int mul = a*b;
    	   System.out.println("mul is "+mul);
       }

	@Override
	void demo() {
		// TODO Auto-generated method stub
		
	}
       
     
     
}
