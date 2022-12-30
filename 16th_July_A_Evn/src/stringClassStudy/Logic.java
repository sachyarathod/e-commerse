package stringClassStudy;

public class Logic {

	public static void main(String[] args) 
	{
		String s = "java is a programing";
		 String[] sp = s.split(" ");
		 for(int i =0;i<=sp.length-1;i++) 
		 {
			 System.out.println(sp[i]);
		 }
		
		int count = s.length();
		
	    int replacea=  s.replace("a", "").length();
		
	   System.out.println(count);
		System.out.println(replacea);
		System.out.println("==============");
		int a = count-replacea;
		System.out.println(a);
		
		    s.split(s);
		    System.out.println("================");
		String p = "Dagadwadi";
		String reverse = "";
		for(int i=p.length()-1;i>0;i--) {
			
			reverse= reverse+p.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
