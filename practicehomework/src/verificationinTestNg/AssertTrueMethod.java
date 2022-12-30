package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueMethod {
  @Test
  public void testing()
  {
	  
	  boolean p = true;
	  boolean s = true;
	  
	  Assert.assertTrue(p,"if p is not true TC is failed ");
	  Assert.assertTrue(s,"s is not true TC is failed");
	  
  }
}
