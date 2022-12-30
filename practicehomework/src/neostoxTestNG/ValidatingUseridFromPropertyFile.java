package neostoxTestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neostoxBaseclass.Baseclass;
import neostoxPomclass.NeostoxHomepage;
import neostoxPomclass.NeostoxLoginpage;
import neostoxPomclass.Neostoxpassword;
import neostoxUtilityclass.Utilityclass;
import neostoxUtilityclass.Utilityproperties;

public class ValidatingUseridFromPropertyFile extends Baseclass 
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
		login.EnterMobilenumber(driver, Utilityproperties.readDataFromPropertyFile("mobileNumber"));
		login.clickonsigninbutton2(driver);
		Utilityclass.wait(driver, 1000);
		
		passowrd.enterpassword(driver, Utilityproperties.readDataFromPropertyFile("password"));
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
	  
	   Assert.assertEquals(home.getuserid(driver), Utilityproperties.readDataFromPropertyFile("userName"),"if acutal and expected both are not equal TC failed");
	   Utilityclass.screenshot(driver, home.getuserid(driver));
  
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
