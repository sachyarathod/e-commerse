import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DroopdownStudy {

	public static void main(String[] args) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in/");
			
			// driver.findElement(By.name("q")).click();
			driver.findElement(By.name("q")).sendKeys("Honda");
			
			Thread.sleep(1000);
			
		     List<WebElement> result = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		
		System.out.println(result.size());
		
		for(WebElement s:result)
		{
			System.out.println(s.getText());
		}
		  
		
		
		

	}

}
