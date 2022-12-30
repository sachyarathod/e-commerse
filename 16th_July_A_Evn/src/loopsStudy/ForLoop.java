package loopsStudy;

public class ForLoop {

	public static void main(String[] args)
	
	{
		// for forloop condition 3 things are important		
		
		// i want print velocity 5 times
		
		//1. initialization    2. condition     3. upadation 
		 //     start           end 
		//    1                  5                 by 1
		
	
		// for(initialization ; condition ; updation;)
		
		//  {
		        // block of code to be  executed
		//  }
		
		for(int a=1;a<=5;a++)
		{
			System.out.println("Velovity");
		}
		
		System.out.println("==================");
		
		// i want to print my name 10 times

		for(int b=1;b<=10;b=b+5) 
		{
			System.out.println("Sachin");
		}
		
		for(float c=1;c<=20;c=c+5) 
		{
			System.out.println("Pune");
		}
		
		// i want to write 8 table
		
		// start        condition            updation
		
		
		for(int P=8; P<=80; P=P+8)
		{
			System.out.println(P);
		}
		
		for(int Q=80; Q>=8; Q=Q-8)
		{
			System.out.println(Q);
		}
		
		
		
		
		
	}

}
