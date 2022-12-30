package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistClass {

	public static void main(String[] args) 
	{
		
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add("Velocity");
		ll.add(1234);
		ll.add(84);
		
		ll.peek();
		System.out.println(ll.peek());

		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
	//	System.out.println(ll.poll());
	//	System.out.println(ll.pollFirst());
	//	System.out.println(ll.pollLast());
	//	System.out.println(ll.pop());
		
		ll.isEmpty();
		
		System.out.println("===================");
		
		ListIterator<Object> l = ll.listIterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}

}
