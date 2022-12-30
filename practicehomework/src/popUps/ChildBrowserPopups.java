package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/browser-windows");
			
			driver.findElement(By.id("windowButton")).click();
			Thread.sleep(1000);
			
			// to handle multiple window we use getwindohndles method to get id of window
			String Idofmainpage = driver.getWindowHandle();
			   Set<String> Idofallpages = driver.getWindowHandles();
			   Thread.sleep(1000);
			  System.out.println(Idofmainpage);
			  System.out.println(Idofallpages);
			 
			  // there are multiple id if we want to traverse between them then we use iterator for traverse
			  
			     Iterator<String> it = Idofallpages.iterator();
			      
			           String mainpage = it.next(); 
			           String child  = it.next();
			           Thread.sleep(1000);
			  // to switch from main page to child window we use switch window method
			         
			   driver.switchTo().window(child);
			   driver.manage().window().maximize();
			Thread.sleep(1000);
			    WebElement getText = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
 
			    Thread.sleep(1000);
			    System.out.println(getText.getText());
			    
			    
			   driver.switchTo().window(mainpage);
			   
			     WebElement mainpagetext = driver.findElement(By.xpath("//div[text()='Browser Windows']"));
			    
			    
			   System.out.println(mainpagetext.getText());
			    
			    
			    
	}

}
