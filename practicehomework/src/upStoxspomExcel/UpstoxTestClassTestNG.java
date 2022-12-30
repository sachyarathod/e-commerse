package upStoxspomExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonlyMethod.CommonlyUseMethod;

public class UpstoxTestClassTestNG{
	WebDriver driver;
	UpstoxsHomepage home;
	UpStoxssignInpage sign;
	UpstoxspasscodePage passcode;
	UpstoxsWelcomePage welcome;
	Sheet mysheet;
	
  @BeforeClass
  public void lanchbrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://login-v2.upstox.com/");
	  sign =new UpStoxssignInpage(driver);
	  passcode = new UpstoxspasscodePage(driver);
	  welcome =new UpstoxsWelcomePage(driver);
	  home = new UpstoxsHomepage(driver);
	  File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
	  mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	 
  }
  @BeforeMethod
  public void logintoupstox()
  {
	  sign.enterUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
	  sign.enterPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	  sign.ClickonSignInbutton();
	  CommonlyUseMethod.impliciteWait(driver);
	  passcode.enterpasscode();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	  welcome.clickonNoimgood();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
  }
   
  @Test
  public void validateuserid() throws IOException 
  {
	  String ExpectedUsid = mysheet.getRow(0).getCell(3).getStringCellValue();
	  String ActualUserID = home.getActualusID(driver);
	  
	  Assert.assertEquals(ActualUserID, ExpectedUsid,"If ExpectedUsid and ActualUserID are not matching TC failed ");
  }
  @AfterMethod
  public void logoutupstox()
  {
	 home.clickonlogoutbutton();
  }
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
}
