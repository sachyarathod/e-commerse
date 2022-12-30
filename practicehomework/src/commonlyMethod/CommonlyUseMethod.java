package commonlyMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUseMethod 
{
	
	// to take screenshot we make one method as common method
	
	public static void takesscreenshot(WebDriver driver,String name) throws IOException 
	{
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\Document\\Selenium\\Screenshot"+name+".png");
	
	    FileHandler.copy(src, dest);  
	    
	}
	
	// for scroll into view we make a common method
	
	public static void scrollinToview(WebDriver driver,WebElement actualusid)
	{
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].scrollIntoView(true)",actualusid);
		    
	}
	
	// for implicitewait we make a common method 
	
	public static void impliciteWait(WebDriver driver)
	{
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	
	
	
	

}
