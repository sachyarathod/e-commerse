package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(1000);
			
	//		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Watch ')]")).getText();
			
	WebElement facebook = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]"));	
			
	       facebook.getText();
	       System.out.println( facebook.getText());
			
			
			
			
			

	}

}
