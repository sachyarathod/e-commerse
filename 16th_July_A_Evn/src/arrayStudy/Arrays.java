package arrayStudy; 


   
  public class Arrays {

	public static void main(String[] args) 
	{
		
		
		// declare array 
		
		
		int Pname[] = new int[3];
		
		// array initialisation 
        Pname[0] = 12345;
        Pname[1] = 45636;
        Pname[2] =524673;
     //   Pname[3] =356732;  exception in thread index 3 out of bounds for length 3
        
        // usages
        System.out.println(Pname[0]);
        System.out.println(Pname[1]);
        System.out.println(Pname[2]);
    //   System.out.println(Pname[3]);  Index 3 out of bounds for length 3
        
		
	
		 // i want to store player name
		
		 String PlayerName[] = new String[4];
		 
		 PlayerName[0] = "Sachin";
		 PlayerName[1] = "Rahul";
		 PlayerName[2] = "sai";
		 PlayerName[3] = "Kailas";
		 
		 System.out.println(PlayerName[0]);
		 System.out.println(PlayerName[1]);
		 System.out.println(PlayerName[2]);
		 System.out.println(PlayerName[3]);
 		 
		 
		 
		 // array Traversing using static for loop
		 // array traversing using static for loop
		 
		 for(int i =0;i<=3;i++) 
		 {
			 System.out.println(PlayerName[i]);
		 }
		System.out.println("=====================");
		 
		// array traversing using dynamic for loop
		
		for(int i =0;i<=PlayerName.length-1;i++) 
		{
			System.out.println(PlayerName[i]);
		}
		 
		System.out.println("array traversing using dynamic loop"); 
		 
		System.out.println("====================================");
		
		for(int i=PlayerName.length-1;i>=0;i--)
		{
			System.out.println(PlayerName[i]);
		}

		System.out.println("array traversing using reverse order");
		 System.out.println("===================");
		
		
		 
		 
		 String Name[] = {"Sachin","vaibhav","rahul","Sandip","Vishal","amol"};
		 
	
		 
		 Arrays.sort(Name);
		 
		 for(int i=0;i<=5;i++) 
		 {
			 System.out.println(Name[i]);
		 }
		 System.out.println("==============================");
	    for(int i=Name.length-1;i>=0;i--) 
	    {
	    	System.out.println(Name[i]);
	    }
	    
	    System.out.println("arrange name in asending order");
	    
	     for(int i =Name.length-1;i>=0;i--) 
	     {
	    	 System.out.println(Name[i]);
	     }
	}

	public static void sort(String[] name) 
	{
		// TODO Auto-generated method stub
		
	}

	
	
	
  }
  
  