package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/select-menu");
			Thread.sleep(1000);
			// find the element 
			
		     WebElement serch = driver.findElement(By.xpath("//div[text()='Select Title']"));

		      Thread.sleep(1000);
		      // create object of actions class and provide driver as a parameter
		      Actions act = new Actions(driver);
		      
		      act.click(serch).perform();
		      Thread.sleep(1000);
		      // using keyboard perform actions on element
		 //     act.sendKeys(Keys.ARROW_DOWN).perform();
		      Thread.sleep(1000);
		//      act.sendKeys(Keys.ARROW_DOWN).perform();
		      Thread.sleep(1000);
		 //     act.sendKeys(Keys.ENTER).perform();
		      
		      
		/*        WebElement searchtext = driver.findElement(By.id("toolTipTextField"));
		         Thread.sleep(1000);
		      act.moveToElement(searchtext).click().sendKeys("Sachin rathod").build().perform();
	
	*/}

}
