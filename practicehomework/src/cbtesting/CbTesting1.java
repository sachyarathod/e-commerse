package cbtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CbTesting1 {
	WebDriver driver;
	@Parameters("browsername")
  @Test
  public void chrome(String name)
  {
	  if(name.equals("chrome"))
	  {
	     System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		   driver = new ChromeDriver();
	  }
	  else if(name.equals("microsoft edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "D:\\Selenium velocity\\msedgedriver.exe");
			
		   driver = new EdgeDriver();
			
	  }
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
  }
}
