package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) 
	
	{
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add(1233);
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add("Sachin");
		hs.add(123);
		hs.add(1233);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
	//	hs.clear();
	//	System.out.println(hs);
	
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.contains(null));
		
		    Object s = hs.clone();
		
		    System.out.println(hs.equals(s));
		
		hs.remove("Sachin");
		System.out.println(hs);
		
		//  for each loop used for Hashset
		System.out.println("==========for each loop===============");
		for(Object d:hs)
			
		{
			
			System.out.println(d);
		}
		
		// for hashset we used iterator 
		
		System.out.println("==========for iterator===============");
		    Iterator<Object> it = hs.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
