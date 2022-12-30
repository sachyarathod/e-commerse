package stringClassStudy;

public class StringBufferStudy {

	public static void main(String[] args) 
	{
		
		
		StringBuffer s = new StringBuffer("Sachin");
		System.out.println(s.capacity());
		//s.reverse();
		//System.out.println(s);
		s.append("Rathod");
		System.out.println(s);
		System.out.println("====================");
		System.out.println(s.capacity());
		System.out.println(s.codePointAt(4));
		System.out.println(s.indexOf("c"));
		System.out.println(s.lastIndexOf("i"));
		// s.notify();
		
		StringBuilder p = new StringBuilder("Dagadwadi");
		
		p.append("Village");
		
    	System.out.println(p.append("  t"));
    	System.out.println(p.capacity());

	}

}
