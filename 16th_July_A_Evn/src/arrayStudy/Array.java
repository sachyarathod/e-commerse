package arrayStudy;

public class Array {

	public static void main(String[] args) 
	{
		
		// Array declaration and initialisation in one line
		
		String Name[] = {"abc","efgh","pqrs"};
		
		Arrays.sort(Name);
		
		// arrange array in desending order
		
		for(int i=Name.length-1;i>=0;i--) 
		{
			System.out.println(Name[i]);
			
		}
      
		System.out.println("============================");
		// arrange array in asending order
		
		for(int i =0;i<=Name.length-1;i++)
		{
			System.out.println(Name[i]);
			
		}
	
	
	
      	String name[] []= {{"abc","def","hij"},{"klm","mno","pqr"},{"stu","uvw","xyz"}};
      		
      	
	       for(int i =0;i<=2;i++) // for row 
	       {
	    	   for(int j =0;j<=2;j++) // for column
	    	   {
	    		   System.out.print(name[i][j]+" ");
	    		   
	    	   }
	    	   System.out.println();
	       }
      
	
	}
	
	
	
	
	
	
	
	

}
