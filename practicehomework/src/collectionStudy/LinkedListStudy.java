package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args)
	{
		
	    LinkedList<Object> ll = new LinkedList<>();
	    
	    ll.add("pune");
	    ll.add(1234);
	    ll.add("Sachin");
	    ll.add("Velocity");
	    ll.add(123.42f);
	    ll.add(null);
	    ll.add(null);
	    ll.add(null);
	    ll.add(123);
	    
	    System.out.println(ll);
	    
	    ll.add(2, null);
	    
	    System.out.println(ll);
	    
	    
	    
		
	    System.out.println(ll.peek());
	    System.out.println(ll);
	    
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		
		System.out.println(ll.poll()); // poll ,remove, pop,pollfirst
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.remove());
		
	    System.out.println(ll.pop());
		System.out.println(ll);
		
	//	ll.push(ll);
		
		
		System.out.println("=============for loop================");
		
		
		      Iterator<Object> lt = ll.iterator();
		    
		
		while(lt.hasNext()) 
		{
			System.out.println(lt.next());
		}
		
		System.out.println("=============for each loop=============");
		
		
		for(Object l:ll)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
	}

}
