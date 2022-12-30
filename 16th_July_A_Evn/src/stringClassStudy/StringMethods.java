package stringClassStudy;

public class StringMethods {

	public static void main(String[] args)
	{
		
		
		
		String s1 = "Gangakhed";   // create object of string class
		       s1.length();
		String s2 = new String("Gangakhed");
		s2.length();
		// lenght() method use 
 		
		String a = "Gangakhed";
		
		System.out.println(a.length());
		System.out.println("=====================");
		
	    int StringObject = a.length();
		
		System.out.println("the value of stringObject is "+StringObject);
		
		String a1 = "pune";
		
		System.out.println(a1.length());
		
		int Stringpune = a.length();
		
		System.out.println("the value of Stringpune is "+Stringpune);
		
		String a2 = " parbhani";
		
		System.out.println(a2.length());
		
		int Stringparbhani = a2.length();
		System.out.println("the value of Stringparbhani is "+Stringparbhani);
		
		//=========================================================================
		
		// touppercase ,tolowercase
		
		String a3 = "Sachin";
		System.out.println(a3.toUpperCase());
		
        String toupper = a3.toUpperCase();		
		
		System.out.println("the name is "+toupper);
		
	     String myString = toupper.toLowerCase();
	     
		System.out.println("myString is "+myString);
		
		System.out.println("name is "+a3.toLowerCase());
		
		System.out.println("=======================================");
		//================================================================
		// equals() methods 
		
		    String c = "Rathod";
		    String c1 = "Rathod";
		    
		    String c2 = new String("rathod");
		    String c3 = new String("Rathod");
		    
		// equal() method point out the variable containt only
      	    System.out.println(  c.equals(c1));
            boolean Stringequal = c.equals(c1);
            System.out.println("the value of Stringequal is "+Stringequal);
		  
		    System.out.println( c1.equals(c2));
		     boolean Stringeq = c1.equals(c2);
		     System.out.println("Stringeq is "+Stringeq);
		     
		   System.out.println(c.equals(c3));
		   
		     System.out.println(c==c1);
		     System.out.println(c1==c3);
		     System.out.println(c2==c3);
		    
				System.out.println("=======================================");
				//================================================================
				// contains() methods 
				
		   String d = "India";
		   
		 System.out.println( d.contains("id"));
		 System.out.println(d.contains("In"));
		 System.out.println(d.contains("dia"));
		 
		 System.out.println(d.contains("Indi"));
		
		 System.out.println("=======================================");
			//================================================================
			// isEmpty() methods 
		
		String e = "Maharashtra";
		String f = "";
		String g = "   ";
		System.out.println(e.isEmpty());
		System.out.println(f.isEmpty());
		System.out.println(g.isEmpty());
		
		 System.out.println("=======================================");
			//================================================================
			// isBlank() methods 
		
		String h = "Sachin";
		String r = "    ";
		String j = "";
        System.out.println(h.isBlank());
		System.out.println(r.isBlank());
		System.out.println(j.isBlank());
		
		 System.out.println("=======================================");
			//================================================================
			// charAt() methods 
		 
		 String k = " Parbhani";
		 
		 System.out.println(k.charAt(4));
		 System.out.println(k.charAt(6));
		 System.out.println(k.charAt(3));
		// System.out.println(k.charAt(10));  exception error
		
		 System.out.println("=======================================");
			//================================================================
			// endWith() methods 
		
		String l = "dagadwadi";
		
		System.out.println(l.endsWith("di"));
		System.out.println(l.endsWith("wadi"));
		System.out.println(l.endsWith("ga"));
		
		 System.out.println("=======================================");
			//================================================================
			// startWith() methods 
		
		String m = " maharashtra";
		
		System.out.println(m.startsWith(" "));
		System.out.println(m.startsWith(" mah"));
		
		System.out.println(m.startsWith(" ma,3"));
		
		System.out.println("===========================");
		
		String n = "Sachin";
		String n1 = "Rathod";
		
		   String   concat1 =n.concat(n1);
		   
		   System.out.println(concat1);
		   
		   System.out.println("=======================================");
			//================================================================
			// indexOf() methods 
		   
		   String o = "Dagadwadi";
		   
		      o.indexOf("5");
		      System.out.println( o.indexOf("d"));
		   
		   System.out.println(o.indexOf("i"));
		   
		//   System.out.println(o.indexOf("g", 'w'));
		   System.out.println("==================================================");
		   
		   
		 // split() method
		   
		   String s = "I LOVE MY INDIA";
		   
		 String[] mycountry =s.split(" ");
		  
		 for(int i=0;i<=mycountry.length-1;i++) 
		 {
			 System.out.println( mycountry[i]);
		 }
		 System.out.println("===============================");
		 
		   String p = "MY VILLEGE NAME IS DAGADWADI";
		   
		      String[] myvillege = p.split(" ");
		   
		   for(int i=0;i<=myvillege.length-1;i++)
		   {
			   System.out.println(myvillege[i]);
		   }
		   
		   System.out.println("============================");
		   
		   
		   String q = "my_village";
		    String[]   mygaon  = q.split("_");
		   
		   for(int i =0;i<=mygaon.length-1;i++)
		   {
			   System.out.println(mygaon[i]);
		   }
		   
		   System.out.println("===============");
		   
		   String z = "velocity katraj pune";
		   
		  z.substring(16);
		  System.out.println(z.substring(16));
		  z.substring(1, 8);
		  System.out.println(z.substring(0, 8));
		  
		  System.out.println("=======================================");
		  String d2 = "Velocity katraj pune";
		  
		  String[] d3 = d2.split(" ");
		  
		  for(int i=0;i<=d3.length-1;i++)
		  {
			  System.out.println(d3[i]);
		  }
		  
		  
		  
		  
		  
		  String h4 = "Pune";
		  
		  String reverse ="";
		  for(int i=h4.length()-1;i>=0;i--)
		  {
			  char t = h4.charAt(i);
			  reverse = reverse+t;//  enup
		  }
		  
		  System.out.println(reverse);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
