package logically;

public class EvenOddNumbersFromArray {

	public static void main(String[] args) 
	{
		int numbers[]  = {3,5,6,7,9,2,0};
	
		System.out.println(numbers.length);
		System.out.println("odd numbers are :-");
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2!=0)
			{
				System.out.println(numbers[i] +" ");
			}
		}
		System.out.println("Even numbers are :-");
		for(int i=0;i<numbers.length-1;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i] );
			}
		}
		
		int NO[] = {1,8,5,9,4,3,0};
		// find odd and even numbers from above array 
		System.out.println("Even Numbers are :-");
		System.out.println(NO.length);
		for(int i=0;i<=NO.length-1;i++)
		{
			if(NO[i]%2==0)
			{
				System.out.println(NO[i]);
			}
		}
		System.out.println("Odd Numbers are :-");
		for(int i=0;i<=NO.length-1;i++)
		{
			if(NO[i]%2!=0)
			{
				System.out.println(NO[i]);
			}
		}
	}

}
