package logically;

public class Exceptation {

	public static void main(String[] args)
	{
		
		String s = null;
	
		
		try
		{
			System.out.println(s.charAt(4));  // risky code 
			
		} catch (NullPointerException e) 
		{
			System.out.println("we can not handle null exceptation");
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("we vcan not handle index out of bound");
		}
		finally 
		{
            System.out.println("I am handaling exceptation");			
		}

	}

}
