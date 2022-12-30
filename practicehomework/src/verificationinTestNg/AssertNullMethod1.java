package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullMethod1 {
  @Test
  public void testing()
  {
	  
	  String a = null;
	  String b = "sachin";
	  
	  Assert.assertNull(a,"If a is not null TC is failed");
	  Assert.assertNull(b,"if b is not null TC is failed");
	  
	  
  }
}
