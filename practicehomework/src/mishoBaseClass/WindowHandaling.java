package mishoBaseClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandaling {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(ch);
		//driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
	   
	    // to get id of all window we use getwindowhandles method 
	    Set<String> idofAllpage = driver.getWindowHandles();
	    
	    Iterator<String> it = idofAllpage.iterator();
	    
	   String mainpage = it.next();
	   String childPage = it.next();
	    
	   // switch selenium focus from main window to child window
	   driver.switchTo().window(childPage);
	   Thread.sleep(500);
	   String Textvalue = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	   
	   System.out.println(Textvalue);

	   Thread.sleep(5000);
	   // onces perform action on child window swictch selenium focus form child to main window
	   driver.switchTo().window(mainpage);
	   Thread.sleep(5000);
	   String text = driver.findElement(By.xpath("//div[text()='Browser Windows']")).getText();
	   
	   System.out.println(text);
	}

}
