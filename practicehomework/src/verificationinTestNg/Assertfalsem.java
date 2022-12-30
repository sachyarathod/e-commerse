package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalsem {
  @Test
  public void testing() 
  {
	  
	  boolean a = true;
	  boolean b = false;
	  
	  Assert.assertFalse(b,"if b is not false TC is failed");
	  Assert.assertFalse(a,"if a is true TC is failed");
	  
  }
}
