package testngsuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeMeth {
    @Test(groups = "funds")
     public void A() 
     {
	  Reporter.log("A method running", true);
     }
    @Test
    public void B() 
    {
	  Reporter.log("B method running", true);
    }
    @Test(groups = "funds")
    public void C() 
    {
	  Reporter.log("C method running", true);
    }
    @Test
    public void D() 
    {
	  Reporter.log("D method running", true);
    }
}
