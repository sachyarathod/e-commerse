package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) 
	{
		
		
		ArrayList<Object> ar = new ArrayList<>();
		
	   ar.add(123);
	   ar.add("Sachin");
	   ar.add(null);
	   ar.add(null);
	   ar.add('A');
	   ar.add("pune");
	   ar.add(12.43f);
	   ar.add(12.456d);
	   ar.add("Dagadwadi");
	   
		System.out.println(ar);
		
		ar.add(2, "velocity");
		
		System.out.println(ar);
		
	//	ar.clear();
	//	System.out.println(ar);
		
		    Object ar1 = ar.clone();
		System.out.println(ar);
		
		System.out.println(ar.contains("Dagadwadi"));
		System.out.println(ar);
		
		System.out.println(ar.equals(ar1));
		
		System.out.println(ar.get(0));
		
		System.out.println(ar.get(3));
		
		System.out.println(ar.indexOf("Sachin"));
		
		System.out.println(ar.indexOf("pune"));
		
		System.out.println(ar.isEmpty());
		
	//	ar.clear();
		
		System.out.println(ar.isEmpty());
		
		
		System.out.println(ar.remove(3));
		
		System.out.println(ar);
		
		System.out.println(ar.set(3, "Rathod"));
		
		System.out.println(ar);
		
		System.out.println(ar.size());
		
		
		ArrayList<Integer> as = new ArrayList<>();
		
		as.add(1);
		as.add(344);
		as.add(23);
		as.add(455);
		
		as.add(123);
		System.out.println(as);
		as.add(3, null);
		
		System.out.println(as);
		
	//	as.clear();
		System.out.println(as);
		
		as.remove(4);
		
		System.out.println(as);
		
		System.out.println(as.get(3));
		
		
		System.out.println(as.indexOf(123));

		   Object as1 = as.clone();
		   
		   System.out.println(as.equals(as1));
		   
		   System.out.println(as.remove(3));
		
		   System.out.println(as.set(3, 1111));
		   
		   System.out.println(as);
		   
	}

}
