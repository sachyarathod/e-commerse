package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotequals {
  @Test
  public void testing()
  {
	  String a = "abc";
	  String b = "bc";
	  
	  Assert.assertNotEquals(a, b,"a and b are not equal TC passed");
	  Assert.assertNotEquals(a, b,"if a and b are equal TC failed");
	  
	  
	  
  }
}
