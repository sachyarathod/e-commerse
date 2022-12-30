package neostoxpom;

import org.testng.annotations.Test;

import commonlyMethod.CommonlyUseMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NeostoxtestNgclass {
	
	 WebDriver driver;
	 Neostoxsigninpage sign;
	 Neostoxpasswordpage password;
	 Neostoxpopups pop;
	 NeostoxHomepage home;
	@BeforeClass
	  public void lanchbrowser()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		  
		  // create object of chromedriver taking reference of webdriver interface
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://neostox.com/");
		  
		  // create object of each pom class 
		  // create object of sign in page 
		  sign = new Neostoxsigninpage(driver);
		  // create object of password page 
		  password = new Neostoxpasswordpage(driver);
		  // create object of pop up page
		  pop = new Neostoxpopups(driver);
		  // create object of home page
		  home = new NeostoxHomepage(driver);
		 
	  }
	
	@BeforeMethod
	  public void signintoneostox() throws InterruptedException 
	{
		sign.clickonsigninbutton();
		sign.entermono();
		sign.clickonsignbutton();
		CommonlyUseMethod.impliciteWait(driver);
		password.enterpasswordfiled();
		Thread.sleep(1000);
		password.clickonsubmitbutton();
		CommonlyUseMethod.impliciteWait(driver);
	  }
	
  @Test
  public void validateuserid() throws IOException 
  
  {
	  home.clickonclose();
	  home.clickonclose();
	  CommonlyUseMethod.impliciteWait(driver);
	  String ActualuserID = home.getactualuserid(driver);
	  String Expecteduserid = "Hi Sachin Rathod";
	  
	  Assert.assertEquals(ActualuserID, Expecteduserid,"If Expecteduserid and ActualuserID not same TC failed");
	  
	  
  }
  
  @AfterMethod
  public void logoutneostox() 
  {
	  home.clickonlogoutbutton();
  }

  @AfterClass
  public void closebrowser() 
  {
	  driver.close();
  }

}
