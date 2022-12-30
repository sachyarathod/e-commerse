package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotStudy {

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		
		  driver.get("https://www.flipkart.com/");
		
		  Thread.sleep(2000);
		
	      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		  System.out.println(src);
		
		  String random = RandomString.make(3);
		  
		  File dest = new File("D:\\Document\\Selenium\\Screenshot"+random+".png");
	
		  FileHandler.copy(src, dest);
		
		
	}

}
