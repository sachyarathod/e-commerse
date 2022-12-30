package variableTypes;

public class StudentInfo
{
       String name;  //non-static global variable declaration
        float age;   // non-static global variable declaration
       char gender;  // non-static global variable declaration
     static  int sal; //  global variable declaration
       
     public void test() 
     {
    	 name ="Sachin"; 
    	 age = 22.6f;
    	 gender ='M';
    	
    	 System.out.println("Student name is "+name);
    	 System.out.println("Student age is "+age);
    	 System.out.println("Student gender is "+gender);
    	 
     }
       
	public static void test1()
	{
		 sal = 123;
		 System.out.println("Student sal is "+sal);
	}
	
	public static void main(String[] args)
	{
		test1();  // calling static method from same class
		
		StudentInfo SI = new StudentInfo(); // calling non static method from same class
		SI.test();
		
		}

	
}
