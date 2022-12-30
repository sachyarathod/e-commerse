package ifElse;

public class IfElseStudy {
                      
	      int a=10;  // non-static global variable 
	   static int c=15;   // static global variable 
	static int d=21; // static global variable 
	
	
	public static void main(String[] args) 
	{
	    // if ticket is Available then i visit to Village else i not visit to village
        String Ticket="available";
         if(Ticket !="available") 
         {
        	 System.out.println("i visit to village");
         }
        	 
         else
         {
        	 System.out.println("i not visit to village");
         }
         
         IfElseStudy IE = new IfElseStudy();
         IE.add();
         
        // calling static global variable from same class
         test();
         
         
         
         
         // i want to print my marks, marks greater than 35 it will print pass otherwise it will be fail  
         
         int marks = 45;
         if(marks>35) 
         
         	System.out.println("i am pass");
          
         
         
         
         
	}
        public IfElseStudy()
        {
             float a=1.23f;
             float b=1.51f;
             float mul = a*b;
             System.out.println("mul is "+mul);
       
        }
        public void add() 
        {
        	int a=12;
         	int b=14;
         	int c=32;
        	int equation = a+c-b;
        	System.out.println("the value of equation is "+equation);
        }
        public static void test() 
        {
        	int sum = c+d;
        	System.out.println("The value of sum is "+sum);
        }
        
        
        
       
        
        
     
        
        
        
        
        
        
        
        
        
        
        
        
}
