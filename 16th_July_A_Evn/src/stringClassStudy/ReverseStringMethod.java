package stringClassStudy;

public class ReverseStringMethod {

	public static void main(String[] args) 
	{
		
		
		
		String s = "Velocity";
		
		String temp = "";
		
		for(int i =s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
			//temp=""+y-->y
			//yt=y+t
			//yti=yt+i
		}
		
		System.out.println(temp);
		
		System.out.println("====================================");
		

		String p = "rathod";
		String sach = "";
		for(int i = p.length()-1;i>=0;i--)
		{
			sach = sach+p.charAt(i);
		}
		System.out.println(sach);
		
		
		
		
		
		String d = "Dagadwadi";
		String dag = "";
		for(int i = d.length()-1;i>=0;i--)
		{
			dag= dag +d.charAt(i);
		}
		System.out.println(dag);
		
		
		
		     
		     
		     
		
		String z = "Dagadwadi";
		
		String str = "";
		
		for(int i = z.length()-1;i>=0;i--)
		{
			str = str+z.charAt(i);
		}
		System.out.println(str);
		
		
		
		
		

	}

}
