package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPestStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("sachinrathod9921@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("pass")).sendKeys("Sachin@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			Thread.sleep(2000);
			 WebElement firstname = driver.findElement(By.name("firstname"));
			 firstname.sendKeys("Sachin");
			 Thread.sleep(1000);
			 WebElement lastname = driver.findElement(By.name("lastname"));
			 
			Actions act = new Actions(driver);
			
			//act.keyDown(firstname,Keys.CONTROL).sendKeys("a").build().perform();
			 act.sendKeys("c").perform();
			Thread.sleep(1000);
			lastname.click();
			Thread.sleep(1000);
			act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
			
			 
			
			
			

	}

}
