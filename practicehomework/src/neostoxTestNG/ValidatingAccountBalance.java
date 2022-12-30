package neostoxTestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neostoxBaseclass.Baseclass;
import neostoxPomclass.NeostoxHomepage;
import neostoxPomclass.NeostoxLoginpage;
import neostoxPomclass.Neostoxpassword;
import neostoxUtilityclass.Utilityclass;

@Listeners(neostoxUtilityclass.Listener.class)
public class ValidatingAccountBalance extends Baseclass 
{
	NeostoxLoginpage login;
	Neostoxpassword passowrd;
	NeostoxHomepage home;

	@BeforeClass
	public void launchbr()
	{
		launchbrowser(); // from base class
		Reporter.log("lanching browser", true);
		login = new NeostoxLoginpage(driver);
		passowrd = new Neostoxpassword(driver);
		home = new NeostoxHomepage(driver);	
	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clicKonsigninbutton(driver);
		login.EnterMobilenumber(driver, Utilityclass.excelreading(driver, 3, 0));
		login.clickonsigninbutton2(driver);
		Utilityclass.wait(driver, 1000);
		
		passowrd.enterpassword(driver, Utilityclass.excelreading(driver, 3, 1));
		Thread.sleep(3000);
		passowrd.clickonsubmitbutton(driver);
		Thread.sleep(5000);
		
		home.cliclonOkButton(driver);
		Utilityclass.wait(driver, 1000);
		
	}
	@Test
	 public void validateuserid() throws IOException 
	  {
		 Utilityclass.wait(driver, 1000);
		  
		 Assert.assertEquals(home.getuserid(driver), Utilityclass.excelreading(driver, 3, 2),"if acutal and expected both are not equal TC failed");
		 Utilityclass.screenshot(driver, home.getuserid(driver));
	  }
   @Test(priority = -1)
    public void validateAccBalance() throws IOException 
     {
	   Utilityclass.wait(driver, 1000);
	  
	   Assert.assertNotNull(home.getaccountbalance(driver),"if account balance is null TC faled");
	   Assert.fail();
 
      }
    @AfterMethod
    public void logout()
     {
	   Utilityclass.wait(driver, 1000);
	   home.clickonUserid(driver);
	   Utilityclass.wait(driver, 1000);
	   home.clickonLogout(driver);
     }
    @AfterClass
    public void closeBrowser()
      {
	   Utilityclass.wait(driver, 1000);
	   driver.close();
     }
  
}
