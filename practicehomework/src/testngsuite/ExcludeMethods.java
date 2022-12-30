package testngsuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcludeMethods {
	@Test
	  public void f() {

		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://vctcpune.com/selenium/practice.html");
	  
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
