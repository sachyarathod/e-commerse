package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetStudy {

	public static void main(String[] args) 
	{
		
		
		LinkedHashSet<Object> lh = new LinkedHashSet<>();
		
		lh.add(123);
		lh.add("Sachin");
		lh.add(null);
		lh.add(123);
		lh.add("pune");
		lh.add("Katraj");
		lh.add(null);
		lh.add("Rathod");
		
		System.out.println(lh);
		
		System.out.println(lh.size());
		
		lh.remove(null);
		System.out.println(lh);
		
		
		System.out.println("===========for each loop============");
		
		for(Object l:lh)
		{
			System.out.println(l);
		}
		
		
		System.out.println("===========for Iterator============");
		
		     Iterator<Object> it = lh.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		

	}

}
