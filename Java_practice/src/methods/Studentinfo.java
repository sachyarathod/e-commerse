package methods;

public class Studentinfo {

	public static void main(String[] args) 
	{
	   Student("Sachin Rathod", 'M', "Mechanical", 123456);
		Student( "Prafull Gadlinge", 'M', "MCA", 12345);
		Student(" Sneha Sadalge", 'F', "BE E&TC", 1234);
		Student("Reshma Gore", 'F', "MSC Mathematics", 123);
		Student("Rupali Malekar ", 'F', "BSC Physics", 12);
		Studentinfo Si = new Studentinfo();
		Si.Student1("Sachin Rathod", 'M', "Mechanical", 123456);
		Si.Student1( "Prafull Gadlinge", 'M', "MCA", 12345);
		Si.Student1(" Sneha Sadalge", 'F', "BE E&TC", 1234);
		Si.Student1("Reshma Gore", 'F', "MSC Mathematics", 123);
		Si.Student1("Rupali Malekar ", 'F', "BSC Physics", 12);
	}
      public static void Student(String StudentName, char Gender, String Department,int PRNno)
      {
    	  System.out.println(" My name is "+StudentName);
    	  System.out.println(" My Gender is "+Gender);
    	  System.out.println(" My Department  is "+Department);
    	  System.out.println(" My PRNno is "+PRNno);
      }
      public void Student1(String StudentName, char Gender, String Department,int PRNno)
      {
    	  System.out.println(" My name is "+StudentName);
    	  System.out.println(" My Gender is "+Gender);
    	  System.out.println(" My Department  is "+Department);
    	  System.out.println(" My PRNno is "+PRNno); 
      }
}
