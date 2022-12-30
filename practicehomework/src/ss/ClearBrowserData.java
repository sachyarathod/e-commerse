package ss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearBrowserData {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	        driver.get("chrome://settings/clearBrowserData?search=clear");
	        Thread.sleep(3000);
	        WebElement data = driver.findElement(By.id("clearBrowsingDataConfirm"));
	        data.click();
	        
	        // for explicit wait we create object of webdriver wait 
	        WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
	        
	        w.until(ExpectedConditions.visibilityOf(data));
	
	}

}
