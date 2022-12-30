package verificationinTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert12{
  @Test
  public void testing()
  {
	  
	  String a = "abc";
	  String b = "abc";
	  boolean s = false;
	  String d = null;
	  
	  // create object of soft assert
	  SoftAssert soft = new SoftAssert();
	  soft.assertTrue(s,"if s is not true TC failed");
	  soft.assertEquals(a, b,"if a and b are not same TC failed");
	  soft.assertNull(b,"if B is not null TC failed");
	  soft.assertNotEquals(a, b,"if a and b are not equal TC  failed");
	  soft.assertFalse(s,"if s is not false TC is failed");
	  soft.assertNull(d,"if d is not null TC is failed");
	  
	  soft.assertAll();
	  
	  
  }
}
