package logically;

public class ReverseTheNumberWithoutSTring {

	public static void main(String[] args) 
	{
		int orgNumbers = 1234;
		int revNumbers = 0;
		
		// System.out.println(orgNumbers/10); it returns  123
		// System.out.println(orgNumbers%10); it returns reminder (baki) = 4
		
		for(int i=orgNumbers;i>0;i=i/10)
		{
			int rem = i%10; // 4,3,2,1
			revNumbers =revNumbers*10+rem;
			// 0*10+4=4
			// 4*10+3=43
			// 43*10+2=432
			// 432*10+1=4321
		}

		System.out.println(revNumbers);
		
		
		int Number = 56789;
		int ReNumber = 0;
		
		for(int i=Number;i>0;i=i/10)
		{
			int t = i%10;
			ReNumber = ReNumber*10+t;
		}
		System.out.println(ReNumber);
		System.out.println("======================================");
		
		int numbers[]  = {'1','2','3','4','6'};
		for(int i=0;i<numbers.length;i++)
		{
		if(numbers[i]%2==0)
		{
			  System.out.println("Even numbers in numbers[] are "+numbers[i]);
		}
		else 
		{
			System.out.println("Odd numbers in numbers[] are "+numbers[i]);
		}
		}
	}

}
