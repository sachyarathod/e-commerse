package diamondAmbiguty;

public interface A 

{
	
	
	void study();
	void study1();
	default void love()
	{
		 
		System.out.println("love  method from A interface");
	}
	
	

}
