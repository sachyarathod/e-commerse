package testngsuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMeth2 {
    @Test(groups = "un")
     public void E() 
     {
	  Reporter.log("E method running", true);
     }
    @Test
    public void F() 
    {
	  Reporter.log("F method running", true);
    }
    @Test(groups = "un")
    public void G() 
    {
	  Reporter.log("G method running", true);
    }
    @Test
    public void H() 
    {
	  Reporter.log("H method running", true);
    }
}
