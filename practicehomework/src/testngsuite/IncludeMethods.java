package testngsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IncludeMethods {
	 @Test
	    public void f2()
	  {  
	    	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://facebook.com");
	  }
}
