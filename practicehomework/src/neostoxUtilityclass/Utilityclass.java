package neostoxUtilityclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


public class Utilityclass 
{
	
	
	//  screenshot, wait, scrolling, excel reading
	
	public static String excelreading(WebDriver driver,int row,int cell) throws EncryptedDocumentException, IOException 
	{
	wait(driver, 500);
	File myfile = new File("D:\\Selenium velocity\\poi\\Myfiles.xlsx");
	String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
	Reporter.log("Reading excel  ", true);
	return value;
	}
	
	public static void scrolllintoview(WebDriver driver,WebElement element)
	{
		wait(driver, 500);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("scrolling in to view", true);
	}
	
	public static void screenshot(WebDriver driver,String screenshot) throws IOException
	{
		 wait(driver, 500);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\Document\\Selenium\\Screenshot"+screenshot+".png");
		 FileHandler.copy(src, dest);
		 Reporter.log("tacking screenshot ", true);
	}
	
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("waiting for "+waitTime+"ms" , true);
	}
	 

}
