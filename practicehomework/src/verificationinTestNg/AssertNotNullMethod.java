package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullMethod {
  @Test
  public void testing() 
  {
	  
	  String a = null;
	  String b = "Sachin";
	  
	  Assert.assertNotNull(b,"if b is null TC is failed");
	  Assert.assertNotNull(a,"if a is null TC is failed");
		  
		  
	  
	  
  }
}
