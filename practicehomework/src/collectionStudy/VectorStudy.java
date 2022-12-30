package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	
	{
		Vector<String> s = new Vector<>();
		
		s.add("Sachin");
		s.add("Dagadwadi");
		s.add("Gangakhed");
		s.add("pune");
		s.add("Parbhani");
		s.add("asfd");
		s.add("jghduwe");
		s.add("jfd");
		s.add(null);
		s.add(null);
		s.add(null);
		s.add("velocity");
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.capacity());
		
		System.out.println(s.get(3));
		System.out.println(s.indexOf("velocity"));
		
		System.out.println(s.clone());
		
		System.out.println("=================for loop====================");
		
		for(int i =0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}
		
		System.out.println("=================for each loop====================");
		
		for(String a:s)
		{

			System.out.println(a);
		}
		
		System.out.println("=================Iterator====================");
		
		    Iterator<String> as = s.iterator();
		
            while(as.hasNext())
            {
            	System.out.println(as.next());
            }
	
            System.out.println("=================List iterator====================");
	
	               ListIterator<String> ad = s.listIterator();
	               
	               
	             while(ad.hasNext()) 
	             {
	            	 System.out.println(ad.next());
	             }
	               
	            System.out.println("============innumuration===");
	            
	            
	                Enumeration<String> ss = s.elements();
	      
	                while(ss.hasMoreElements()) {
	                	System.out.println(ss.nextElement());
	                }
	               
	}

}
