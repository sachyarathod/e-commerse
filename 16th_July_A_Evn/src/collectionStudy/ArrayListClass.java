package collectionStudy;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) 
	{
		
		ArrayList Object = new ArrayList();
		Object.add("sachin");
		Object.add(1234);
		Object.add(null);
		Object.add(null);
		
		System.out.println(Object);
		 java.lang.Object al = Object.clone();
		 System.out.println(al);
		 
		 al.equals(Object);
		 System.out.println(al.equals(Object));
		 
		 Object.contains(1234);
		 System.out.println(Object.contains(1234));
		 
		 Object.add(3, "Rathod");
		 System.out.println(Object);
		 
		 Object.get(3);
		 System.out.println(Object.get(3));

		 System.out.println(Object.hashCode());
		 
		 Object.indexOf(null);
		 System.out.println(Object.indexOf(null));
		 
		 Object.iterator();
		 Object.remove(3);
		 System.out.println(Object);
		 
		
	}

}
