package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest {
  @Test
  public void Testfirst() 
  {
	  
	  System.out.println("A test is passsed");
	  
	  Reporter.log("A test is passsed----> using String log report");
	  
	  Reporter.log("A test is passsed--->using string log reporter with boolean value", true);
	  
  }
}
