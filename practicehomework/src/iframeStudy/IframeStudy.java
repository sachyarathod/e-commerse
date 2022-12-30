package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException 
	
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			
			
			driver.switchTo().frame("courses-iframe");
			
		   Thread.sleep(1000);
		   
           WebElement GetText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]"));
			
			
			System.out.println( GetText.getText());
			
			driver.switchTo().defaultContent();
			
			//  driver.switchTo().parentFrame();
			
			driver.findElement(By.id("checkBoxOption1")).click();
			
	}

}
