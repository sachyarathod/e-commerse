package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListStudy2 {

	public static void main(String[] args) 
	{
		
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Sachin");
		al.add(1230);
		al.add('A');
		al.add("Velocity");
		al.add(3423.64f);
		al.add(null);
		al.add(null);
		
		System.out.println(al);

	
		
		
		System.out.println("================for loop============");
		
		for(int i =0;i<=al.size()-1;i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========for each loop====================");
		
		for(Object a:al) 
		{
			System.out.println(a);
		}
		
		System.out.println("==============Iterator=============");
		
		       Iterator<Object> as = al.iterator();
		
		 while(as.hasNext()) 
		 {
			 System.out.println(as.next());
		 }
		
		System.out.println("===========for listIterator============");
		
		       ListIterator<Object> ab = al.listIterator();
		
		       
		      while(ab.hasNext()) 
		      {
		    	  System.out.println(ab.next());
		      }
		       
	}

}
