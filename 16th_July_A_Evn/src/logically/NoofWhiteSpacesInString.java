package logically;

public class NoofWhiteSpacesInString {

	public static void main(String[] args)
	{
		
		String a = "p u  ne";
		int count =0;
		char space =' ';
		for(int i=0;i<=a.length()-1;i++)
		{
			 char t = a.charAt(i);
			 
			 if(t==space)
			 {
				 count++;
			 }
			 
		}

		System.out.println("Number of blank space in string are "+count);
		
		// if i want to count space in string 
		String s ="My name is Sachin Rathod ";
		int count1 =0;
		int soace =' ';
		for(int i=0;i<=s.length()-1;i++)
		{
       			char d = s.charAt(i);
       			if(d==soace)
       			{
       				count1++;
       			}
		}
		System.out.println("Number of blank space in string are "+count1);
	}

}
