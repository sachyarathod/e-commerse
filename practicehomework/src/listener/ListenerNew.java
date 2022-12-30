package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class ListenerNew {
  @Test
  public void E()
  {
	  Reporter.log(" E method is running ",true);
	    
  }
  @Test
  public void F()
  {
	  Reporter.log("F method is running ",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = "F")
  public void G()
  {
	  Reporter.log(" G method is running ",true);
	    
  }
  @Test
  public void H()
  {
	  Reporter.log(" H method is running ",true);
	    
  }
}
