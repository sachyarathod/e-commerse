package verificationinTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void f() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement chechbox = driver.findElement(By.id("checkBoxOption1"));
		
		chechbox.click();
		if(chechbox.isSelected())
		{
			 Reporter.log("if checkbox is selected TC is passed", true);
		}
		else
		{
			 Reporter.log("if checkbox is not selected TC is failed ", true);
		}
	  
	  
	  
  }
}
