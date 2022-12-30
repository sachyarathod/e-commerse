package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException
	{

        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		

		// create object of Action class and take driver object as a parameter
	    Actions act = new Actions(driver);
	    Thread.sleep(1000);
	      	
	    // find the element which we have perform the actions
	    WebElement months = driver.findElement(By.id("month"));
	    Thread.sleep(1000);
	                 
	         // click on that element
	                 
	      	act.click(months).perform();
	      	Thread.sleep(1000);
	      	// move cursure using keyboard 
	     	act.sendKeys(Keys.ARROW_UP).perform();
	      	Thread.sleep(1000);
	      	act.sendKeys(Keys.ARROW_UP).perform();
	      	Thread.sleep(1000);
	     	act.sendKeys(Keys.ENTER).perform();
	     
	      
	      	
	}

}
