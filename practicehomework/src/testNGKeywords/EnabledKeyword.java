package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
  @Test(priority=-1)
  public void priority()
  {
	  
	  Reporter.log("Hi am a priority method", true);
  }
  @Test(enabled =false)
  public void pri()
  {
	  Reporter.log("Hi i am a pri method", true);
  }
  @Test(priority=2,invocationCount =4)
  public void A()
  {
	  Reporter.log("Hi i am a A method", true);
  }@Test(priority=3)
  public void B()
  {
	  Reporter.log("Hi i am a B method", true);
  }@Test
  public void C()
  {
	  Reporter.log("Hi i am a C method", true);
  }
  
  
  
}
