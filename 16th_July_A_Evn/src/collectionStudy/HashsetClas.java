package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClas {

	public static void main(String[] args)
	{
		
		HashSet<Object> h = new HashSet<>();
		
		h.add(123);
		h.add(null);
		h.add(null);
		h.add(123);
		
		System.out.println(h);
		

		
		System.out.println(h.size());
		
		Iterator<Object> it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("============for each ==========");
		
		for(Object f:h)
		{
			System.out.println(f);
		}
	}

}
