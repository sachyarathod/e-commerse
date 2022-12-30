package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountKeyword 
{
	
	// InvocationCOunt means call same method multiple times
  @Test (invocationCount =3)
  public void invocationcount() 
  {
	  Reporter.log("Hi i am invocationcount method", true);
	  
  }
  
  @Test(invocationCount=2)
  public void invocation()
  {
	  Reporter.log("HI i am invocation method ", true);
  }
 @Test(enabled = false)
 public void invocation1()
 {
	  Reporter.log("HI i am invocation method ", true);
 }
  
  
}
