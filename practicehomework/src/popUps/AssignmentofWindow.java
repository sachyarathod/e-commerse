package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentofWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		      // here we get id of main window and all window
		      //      String mainpage = driver.getWindowHandle();
		            Set<String> Idofallpage = driver.getWindowHandles();
		           
		            System.out.println(Idofallpage);
		            
		        // ID get in the form of string, traversing in that string we use iterator    
		            
		          Iterator<String> cd = Idofallpage.iterator();
		             Thread.sleep(1000);
		             String Mainpageid = cd.next();
		             String child = cd.next();
		             Thread.sleep(1000);
		             // stitch selenium focus from main page to child page we use switch to window
		           driver.switchTo().window(child);
		           Thread.sleep(1000);
		           // find element present on webpage i.e - Welcome To Practice Page
		           WebElement getText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		           Thread.sleep(1000);
		           System.out.println(getText.getText());
		
		           Thread.sleep(1000);
		           // here we switch selnium focus from child window to main window
		           driver.switchTo().window(Mainpageid);
		           WebElement getText1 = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		           Thread.sleep(1000);
		           System.out.println(getText1.getText());
		           
		           
		           
		           
	}

}
