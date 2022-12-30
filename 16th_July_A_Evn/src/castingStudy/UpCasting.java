package castingStudy;

public class UpCasting
{

	public static void main(String[] args)
	{
		
               Father f = new Father();  // create object of superclass
               f.farm();
               f.car();
               
               System.out.println("===================");
               
               Son s = new Son();  // create object of subclass
               s.farm();
               s.car();
               s.degree();
               
               System.out.println("========================");
               
               // create object of subclass taking reference of superclass
               
                  Father fs = new Son();
                  
                  fs.farm();
                  fs.car();
                 
	}
}
