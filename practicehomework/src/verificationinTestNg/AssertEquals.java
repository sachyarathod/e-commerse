package verificationinTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void testing()
  {
	  String s = "Sachin";
	  String p = "Sachin";
	  
	  Assert.assertEquals(s,p,"S and p are equals TC is passed");
	  
  }
}
