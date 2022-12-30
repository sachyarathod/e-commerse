package studyMethod;

public class PuneUniversity {

	public static void main(String[] args)
	{
		// calling static void method from same class 
		student();
		PuneUniversity Pu= new PuneUniversity();
		Pu.studentinfo();
	}
	
	public static void student()
	{
	String name;
	int age;
	char div;
	String department;
	char gender;
	
	name = "sachin rathod";
	age = 22;
	gender = 'M';
	div = 'A';
	department =" mechanical";

	 System.out.println("MY name is "+name);
	 System.out.println("MY age is "+age);
	 System.out.println("MY gender is "+gender);
	 System.out.println("MY div is "+div);
	 System.out.println("MY department is "+department);
	 
	}
	 public void studentinfo()
	 {
		 String name;
			int age;
			char div;
			String department;
			char gender;
			
			name = "sachin";
			age = 22;
			gender = 'M';
			div = 'A';
			department =" mechanical";
			 System.out.println("MY name is "+name);
			 System.out.println("MY age is "+age);
			 System.out.println("MY gender is "+gender);
			 System.out.println("MY div is "+div);
			 System.out.println("MY department is "+department); 
	 }
}
