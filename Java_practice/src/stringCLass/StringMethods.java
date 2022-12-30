package stringCLass;

public class StringMethods {

	public static void main(String[] args)
	{
		
		
		String a = "Gangakhed";  // create object of string class without using new keywords
		a.length();
		String b = new String("Parbhani"); //create object of string class using new keywords
		b.toUpperCase();
		
		// length() method-----> it is used for count length of string
		
		String c = "Dagadwadi";
		
		  System.out.println(c.length());
		
		  int StringLenght = c.length();
		  
		  System.out.println("the value of StringLenght is "+StringLenght);
		
		System.out.println("==================================");
		// touppercase() method  and Lowercase() method---> these method used for convert all string character into small letter or capital letter
		
		String d = "Sachin";
		
		System.out.println(d.toUpperCase());
		
		String toupper = d.toUpperCase();
		
		System.out.println("the value of toupper is "+toupper);
		
		
		// tolowercase 
		
		System.out.println(toupper.toLowerCase());
		System.out.println(d.toLowerCase());
		
		

		System.out.println("==================================");
		// contains() method  --> Returns true if and only if this string contains the specified sequence of char values
		
		String e = "Pune";
		
		System.out.println(e.contains("Pu"));
		
		boolean contains = e.contains("ne");
		System.out.println(e.contains("un"));
		
		System.out.println("the vale of contains is "+contains);
		
		System.out.println("==================================");
		// equal() method ----> this method is used for compare two object of specified sequence of  character
		
		String f = "Rathod";
		String f1 =  "rathod";
		String f3 =  "Rathod";
		 String s = "Sachin";

		   String s1 = "Sachin";

		   s.equals(s1);

		
		String f4 = new String("Rathod");
		String f5 = new String("Rathod");
		
		System.out.println(f.equals(f1));
		System.out.println(f.equals(f3));
		System.out.println(f5.equals(f4));
		
		System.out.println(f==f3);
		System.out.println(f4==f5);
		System.out.println(f3==f1);
		
		System.out.println("====================================");
		System.out.println("==================================");
		// isBlank() , is Empty() method----> this method represent true if and if only string is zero or it contains space
		
		String g = "Mumbai";
		 boolean isBlank = g.isBlank();
		
		System.out.println("the value of isBlank is "+isBlank );
		
		String g1 = "";
		System.out.println(g1.isBlank());
		System.out.println(g1.isEmpty()); 
		
		String g2 = "__";
		
		System.out.println(g2.isBlank());
		System.out.println(g2.isBlank()); //Returns true if the string is empty or contains only white space code points,otherwise false.
		
		System.out.println(g2.isEmpty());
		
		String g3 ="     ";
		
		System.out.println(g3.isEmpty());
		
		
		
		System.out.println("==================================");
		// charAt() method ----> Returns the char value at the specified index.
		
		String h = "charoli";
		
		      char charAt = h.charAt(4);
		
		System.out.println("the value of charAt is "+charAt);
		
		System.out.println(h.charAt(2));
		System.out.println(h.charAt(6));
		
		System.out.println("==================================");
		// endsWith() method----> test this method ends with specific suffix
		
		
		String i = "Dagadwadi";
		
		System.out.println(i.endsWith(i));
		
		System.out.println(i.endsWith("adi"));
		
	      boolean endsWith = 	i.endsWith(a);
		
		System.out.println(endsWith);
		
		System.out.println(i.startsWith("Da"));
		i.startsWith("Da");
	     System.out.println(i.startsWith(a));
	     
		System.out.println("==================================");
		// substring() method--> return string begin with the input index and ends with string end
		
		String j = "Sachin";
		
		j.substring(4);
		
		System.out.println(j.substring(4));
		System.out.println(j.substring(2));
		System.out.println(j.substring(3));
		
		System.out.println("==================================");
		// concat() method---->Concatenates the specified string to the end of this string
		
		String k = "Rathod";
		String k1 = "Sachin";
		
		  k.concat(k1).concat(k);
		
		System.out.println(  k.concat(k1));
		
		System.out.println(k1.concat(k));
		

		System.out.println("==================================");
		// Indexof() method---->

// Returns the index within this string of the first occurrence of the specified substring.

		
		String l = "Parbhani";
		l.indexOf("b");
		
		  System.out.println(l.indexOf("b"));
		  
		  System.out.println(l.indexOf("n"));
		  
		  System.out.println(l.indexOf("ha"));
		  
		  System.out.println(l.indexOf("r", 1));
		  
		  
		  System.out.println("==================================");
			// replace() method---->
		  
		  
		  String m = "Sachin";
		  m.replace('a', 'p');
		  
		  System.out.println( m.replace('a', 'p'));
		  System.out.println(m.replace('S', 'd'));
		  
		  System.out.println(m.replace("ch", "ab"));
		  
		  System.out.println(m.replaceAll("Sachin", "Rathod"));
		  
		  System.out.println(m.replace("n", "S"));
		  
		  // split method 
		  
		  String y = "i am in pune ";
		  
		   String[] space = y.split(" ");
		  
		  for(int z =0;z<=y.length()-1;z++) 
		  {
			  System.out.println(space[z]);
		  }
		  
	}

}
