package upStoxspomExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonlyMethod.CommonlyUseMethod;

public class UpstoxTestCLass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		
		// create object of file class and give path of excel sheet to read data from excel
		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	    
		// create object of UpstoxsSigninpagen 
	    CommonlyUseMethod.impliciteWait(driver);
		UpStoxssignInpage sign = new UpStoxssignInpage(driver);
		sign.enterUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		sign.enterPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		sign.ClickonSignInbutton();
		
		// create an object of passcode page
		CommonlyUseMethod.impliciteWait(driver);
		UpstoxspasscodePage passcode = new UpstoxspasscodePage(driver);
		passcode.enterpasscode();
		
		// create an object of welcome page
		// here we use commonly method for implicite wait
        CommonlyUseMethod.impliciteWait(driver);
        UpstoxsWelcomePage wel = new UpstoxsWelcomePage(driver);
        wel.clickonNoimgood();
        
        // create an object of home page
        CommonlyUseMethod.impliciteWait(driver);
        UpstoxsHomepage home = new UpstoxsHomepage(driver);
        home.validateUserid(mysheet.getRow(0).getCell(3).getStringCellValue(),driver);
        home.clickonFundsbutton();
        home.Clickonusername();
        home.clickonlogoutbutton();
        
        
        
        
        
        
        
        
        
        
		

	}

}
