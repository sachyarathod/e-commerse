package collectionStudy;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) 
	{
		
		Vector<Object> al = new Vector<>();
		al.add("Sachin");
		al.add(1234);
		al.add(null);
		al.add(null);
		al.add(76765);
		al.add("Sachin");
		al.add(123);
		al.add(123);
		al.add(908);
		al.add(134.8746);
		al.add("rathod");
		al.add(647);
		
		
		al.capacity();
		System.out.println(al.capacity());
		
		al.get(10);
		System.out.println(al.get(10));
		
		
		al.size();
		System.out.println(al.size());
		
		al.lastIndexOf(647);
		System.out.println(al.lastIndexOf(647));

	System.out.println("============for loop==============");
	
	for(int i=0;i<=al.size()-1;i++)
	{
		al.get(i);
		System.out.println(al.get(i));
	}
	
	System.out.println("============for each loop=============");
	
	for(Object a:al)
	{
		System.out.println(a);
	}
	
	System.out.println("=====================for iterator==========");
	
	 Iterator<Object> it = al.iterator();
	 
	 while(it.hasNext())
	 {
		 it.next();
		 System.out.println(it.next());
	 }
	 
	 System.out.println("========for list iterator====");
	 ListIterator<Object> lt = al.listIterator();
	 
	 while(lt.hasNext())
	 {
		 System.out.println(lt.next());
	 }
		
	}
	

}
