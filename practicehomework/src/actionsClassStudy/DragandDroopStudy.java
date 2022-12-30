package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDroopStudy {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		// 1. create object of actions class and take driver object as argument
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		// 2. find the element which we perform action on it 
		
		      WebElement sourec = driver.findElement(By.xpath("//a[text()=' 5000']"));
		      Thread.sleep(2000);
		      
		      WebElement destination=driver.findElement(By.id("shoppingCart4"));
		      Thread.sleep(2000);
		  //    act.dragAndDrop(sourec, destination).perform();
		
		act.moveToElement(sourec).clickAndHold().release(destination).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
