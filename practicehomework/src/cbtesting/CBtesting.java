package cbtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CBtesting {
	WebDriver driver;
	
  @Parameters("browsername")
  @Test
  public void cbtesting(String cbname) 
  {
	  
	  if(cbname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		
	  }
	  else if(cbname.equals("m"))
	  {
		  
		  System.setProperty("webdriver.edge.driver", "D:\\Selenium velocity\\msedgedriver.exe");
			
			 driver = new EdgeDriver();
			
	  }
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
  }
}
