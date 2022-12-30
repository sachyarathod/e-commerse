package ss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotQues {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
		//	Thread.sleep(1000);  here we make a type casting TakesScreenshot interface with driver object and get function as getscreenshoAs 
			// and put OutputTupe as a parameter 
		        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		        System.out.println(source);
		      //  Thread.sleep(1000);
		        
		        // to store file in d driver we provide a path 
		        File dest = new File("D:\\Document\\Selenium.jpeg");
		    //    Thread.sleep(1000);
		        // we use copy method which is present in copyHandler class
		        FileHandler.copy(source, dest);
		        
		        
	}

}
