package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethodKeyword {
	 @Test(priority=-1)
	    public void B() 
	    {
		  Reporter.log("B method is running", true);
	    }
    @Test(timeOut=300)
    public void A() throws InterruptedException 
    {
    	Thread.sleep(500);
	  Reporter.log("A method is running", true);
    }
   
    @Test(dependsOnMethods ={"A"},invocationCount=2)
    public void C() 
    {
	  Reporter.log("C method is running", true);
    }
    @Test
    public void D() 
    {
	  Reporter.log("D method is running", true);
    }
    
 }
