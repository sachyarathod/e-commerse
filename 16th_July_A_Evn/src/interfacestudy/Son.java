package interfacestudy;

public class Son implements Mother,Father  // multiple inheritance can be done using interface

{

	public static void main(String[] args) 
	{
		
		Son s = new Son();
		
		s.farm();
		s.money();
		s.receipe();
		s.look();
		s.love();
		
		Father.test();   //calling static method from another interface 
		Mother.test();
		
	}

	@Override
	public void farm()   // method override from interface fathers
	{
		System.out.println("fathers farm");
		
	}

	@Override
	public void money()
	{
		
		System.out.println("fathers money");
	}

	@Override
	public void look() 
	{
		System.out.println("Mothers look");
	}

	@Override
	public void receipe()
	{
		System.out.println("Mothers receipe");
		
	}

	@Override
	public void love()
	{
		  Father.super.love();  // calling default same method but from different interface 
		  Mother.super.love();
	}

}
