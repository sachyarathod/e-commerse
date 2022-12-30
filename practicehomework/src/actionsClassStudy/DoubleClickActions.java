package actionsClassStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	// create object of action class and take driver object as a parameter
		Actions act = new Actions(driver);
		
		
		     //  WebElement Rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));

		       
		       
		       // perform right click actions
		       
		 /*      act.moveToElement(Rightclickme).perform();
		       act.contextClick().perform();
		      */
		       
		       // perform double click actions
		       
		// find the locator and save in referance variable
		        WebElement Doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		       
		        Thread.sleep(2000);
		  //      act.moveToElement(Doubleclickbutton).perform();
		   //     act.doubleClick().perform();
		        
		  //      act.doubleClick(Doubleclickbutton).perform();
		        
		        act.moveToElement(Doubleclickbutton).doubleClick().build().perform();
		        Thread.sleep(2000);
		        // to handle alert popUps switch selenium focus to alert popUps 
		        
		          Alert alertpopup = driver.switchTo().alert();
		        
		          
		          Thread.sleep(3000);
		          // get text of alert popups 
		          
		          System.out.println( alertpopup.getText());
		          Thread.sleep(3000);
		          
		          // to handle popups click on ok button
		          alertpopup.accept();
	}

}
