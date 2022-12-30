package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class ListenerNew2 {
  @Test
  public void A()
  {
	  Reporter.log(" A method is running ",true);
	    
  }
  @Test
  public void B()
  {
	  Reporter.log("B method is running ",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = "B")
  public void C()
  {
	  Reporter.log(" C method is running ",true);
	    
  }
  @Test
  public void D()
  {
	  Reporter.log(" D method is running ",true);
	    
  }
}
