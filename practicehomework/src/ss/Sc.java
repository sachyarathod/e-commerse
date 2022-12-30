package ss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sc {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
        System.setProperty("webdriver.edge.driver", "D:\\Selenium velocity\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
	  
		  
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  
		  WebElement text = driver.findElement(By.name("show-hide"));
		  text.sendKeys("Sachin Rathod");
		  Thread.sleep(1000);
		  
		  // for scroll in to view 
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeAsyncScript("arguments[0].scrollIntoView(true)", text);
		  Thread.sleep(1000);
		  
		 String textfield = driver.findElement(By.xpath("//table[@id='product']//tbody//tr//td[2]")).getText();
		  
		 System.out.println(textfield);
		 Thread.sleep(1000);
		  // to take screenshot first we need to do type casting of takescreenshot interface with driver object
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File dest = new File("D:\\Document\\Selenium\\Screenshot\\screenshot.png");
		  
		  FileHandler.copy(src, dest);
		  

	}

}
