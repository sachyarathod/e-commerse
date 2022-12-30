package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGannotations {
    @Test
    public void testMethod() 
    {
	  
	  Reporter.log("Hi i am test method", true);
    } 
    @BeforeMethod
    public void beforemethod()
    {
    	Reporter.log("Hi i am a before method", true);
    }
    @AfterMethod
    public void aftermethod()
    {
    	Reporter.log("Hi i am a after method", true);
    }
    @BeforeClass
    public void beforeclass()
    {
    	Reporter.log(" HI i am before class method", true);
    }
    @AfterClass
    public void Afterclass()
    {
    	Reporter.log("Hi i am a after class method", true);
    }
  
  
  
  
}
