package googlePOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

	public static void main(String[] args) throws IOException 
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com/");
		  // create object of google page
		  Googlepage g = new Googlepage(driver);
		  g.clickonbutton();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  driver.switchTo().frame("app");
		  
		  
		  
		  g.clickonYT(driver, null);
		 
	}

}
