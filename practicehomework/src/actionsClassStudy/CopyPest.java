package actionsClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPest {

	public static void main(String[] args)
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1st launch the url using get method
		driver.get("https://www.facebook.com/");
		
		// create object of action class and pass driver as a parameter
		
		Actions act = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// find the webelement and pass the values
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sachin Rathod");
		
		// here waait is provided to avoid nosuchElement exceptation
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// in this line we copy all the values from the text
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		driver.findElement(By.xpath("//input[@type='password']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// in this line we paste these values
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
	
		
	}

}
