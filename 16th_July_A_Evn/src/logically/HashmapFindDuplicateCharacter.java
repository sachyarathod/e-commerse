package logically;

import java.util.HashMap;

public class HashmapFindDuplicateCharacter {

	public static void main(String[] args)
	{
		
		HashMap<Integer, String> rtoNumber = new HashMap<Integer, String>();
		
		rtoNumber.put(12, "Pune");
		rtoNumber.put(14, "PCMC");
		rtoNumber.put(14, "Gangakhed");
		
		System.out.println(rtoNumber);
		
		String s ="abcxyzabcprrxyz";
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char t = s.charAt(i);
			
		    if(mp.containsKey(t))
		    {
		    	mp.put(t, mp.get(t)+1);
		    }
		    else
		    {
				mp.put(t, 1);
			}
		          
		}
		System.out.println(mp);
		

		
		String a = "Sachin Piraji Rathod gangakhed Rathod Sachin";
		String[] ar = a.split(" ");
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String t = ar[i];
			
			if(m.containsKey(i))
			{
				m.put(t, m.get(t)+1);
				
			}
			else 
			{
				m.put(t, 1);
			}
		}
		
		System.out.println(m);
		
		
		
	}

}
