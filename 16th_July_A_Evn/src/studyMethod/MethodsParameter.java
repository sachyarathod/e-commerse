package studyMethod;

public class MethodsParameter {

	public static void main(String[] args) 
	{
		Studentsinfo("Sachin Rathod", 'M', 23, 5.78f, "Mechanical");
		MethodsParameter Mp = new MethodsParameter();
		Mp.studentinfo1("Sachin Rathod", 'M', 23, 5.78f, "Mechanical");
		Studentsinfo("Vishal", 'M', 20, 5.004f, "BCA");
		Studentsinfo("Shalu", 'F', 22, 4.96f, "Computer");
	}
	
    public static void Studentsinfo(String StudentName, char Gender, int Age, float Height, String Department)
{
	 System.out.println(" My name is "+StudentName);
	 System.out.println(" My gender is "+Gender);
	 System.out.println(" My Age is "+Age);
	 System.out.println("My Height is "+Height);
	 System.out.println(" My Department is "+Department);
}
 
     public void studentinfo1(String StudentName, char Gender, int Age, float Height, String Department)
{
    	 System.out.println(" My name is "+StudentName);
    	 System.out.println(" My gender is "+Gender);
    	 System.out.println(" My Age is "+Age);
    	 System.out.println("My Height is "+Height);
    	 System.out.println(" My Department is "+Department);
}
}
