package collectionStudy;

import java.util.Vector;

public class VectorObjectsStudy {

	public static void main(String[] args) 
	{
		
		
		Vector<Object> c = new Vector<>();
		
		c.add("pune");
		c.add(1223);
		c.add('A');
		c.add(12.543f);
		c.add(123.54d);
		c.add("Sachin");
		c.add(65363);
		c.add("Dagadwadi");
		
		System.out.println(c.size());
		System.out.println(c.capacity());
		System.out.println(c.get(4));
		System.out.println(c.set(3, null));
		System.out.println(c.contains("Sachin"));
		
		System.out.println(c);
		
		
		         Object d = c.clone();
		
		System.out.println(c.equals(d));
		
	//	c.clear();
		
		System.out.println(c);
		
		
		System.out.println("================for loop============");
		
		for(int i = 0;i<=c.size()-1;i++)
		{
			System.out.println(c.get(i));
		}
		System.out.println("================for each-loop============");

		for(Object e:c) 
		{
			System.out.println(e);
		}
		
		
	}

}
