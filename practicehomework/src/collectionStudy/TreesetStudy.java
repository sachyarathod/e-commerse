package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args)
	{
		
		TreeSet<Object> tr = new TreeSet<>();
		
		tr.add(123);
		tr.add(1234);
		tr.add(123);
		tr.add(1);
		tr.add(2);
		tr.add(34);
		tr.add(43);
		tr.add(123456);
		
		
		System.out.println(tr);
		
		
		System.out.println(tr.size());
		
		System.out.println(tr.first());
		
	   System.out.println(tr.pollFirst());
		
	   System.out.println(tr.pollLast());
		
		
	   System.out.println("=============for each loop===========");
		
		for(Object t:tr)
		{
			System.out.println(t);
		}
        
		
		 System.out.println("=============for Iterator===========");
		 
		     Iterator<Object> ite = tr.iterator();
		 
		 while(ite.hasNext()) {
			 
			 System.out.println(ite.next());
		 }
	}

}
