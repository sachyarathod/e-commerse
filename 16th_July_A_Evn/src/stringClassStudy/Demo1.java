package stringClassStudy;

public class Demo1 extends Demo
{

	public static void main(String[] args) 
	{
		
		String s = "Sachin";
		String a = "Rathod";
		
		String c = s+" "+a;
		
		System.out.println("the value of c is "+c);
		
		s.equals(a);
		System.out.println(s.equals(a));
		
		System.out.println(s.toUpperCase());
		System.out.println(a.toLowerCase());
		
	    System.out.println(s.charAt(4));
	    System.out.println(s.contains("hin"));
		
		System.out.println(s.indexOf("c"));
		
		System.out.println(s.isBlank());
		System.out.println(a.isEmpty());
		
		
		System.out.println(s.compareTo(a));
		
		System.out.println(s.length());
		
		String d = s.replace("in", "ya");
		System.out.println(s.replace("in", "ya"));

		System.out.println(d.concat(" "+a));
		
		
		String b = "my village name is dagadwadi";
		
		String[] m = b.split(" ");
		
		for(int i=0;i<=m.length-1;i++)
		{
			System.out.println(m[i]);
		}
		System.out.println(m.length);
	}

}
