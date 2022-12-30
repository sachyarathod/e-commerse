package upStoxsPom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");

		File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	    
		// create object of login page class	
		UpstoxsLoginPage login = new UpstoxsLoginPage(driver);
		login.enterUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPassword();
		login.clickOnSigninbutton();
		
		Thread.sleep(1000);
		
		// create object of Upstox passcode page
		UpstoxsPasscodePage passcode = new UpstoxsPasscodePage(driver);
		passcode.enteryob();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		// create object of welcome page
		UpstoxsWelcomePage welcome = new UpstoxsWelcomePage(driver);
		welcome.clickonNoimgood();
		
		Thread.sleep(1000);
		
		// create object of Upstoxs home page
		UpstoxsHomepage home = new UpstoxsHomepage(driver);
		home.Gettextofusername();
		home.clickonFunds();
		
		Thread.sleep(1000);
		
		// create object of upstoxs securities page
		UpstoxsSecuritiesPage securities = new UpstoxsSecuritiesPage(driver);
		securities.getavailabefund();
		
		Thread.sleep(1000);
		// logout upstoxs
		home.Clickonusername();
		home.clickonlogoutbutton();
		
	}

}
