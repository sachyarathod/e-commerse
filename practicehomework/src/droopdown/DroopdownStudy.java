package droopdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroopdownStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/select-menu");

		      
		driver.findElement(By.id("oldSelectMenu")).click();
		
		 WebElement dri = driver.findElement(By.id("oldSelectMenu"));
		 
		 Select s = new Select(dri);
		 
		 s.selectByIndex(2);
		 
		 List<WebElement> sd = s.getOptions();
		 
		 System.out.println(sd.size());
		      
		 Iterator<WebElement> d = sd.iterator();
		 
		 while(d.hasNext())
		  {
		    System.out.println(d.next().getText());
		  }
		   
		 
		     
		      
		      
		      
		      
		      
	}

}
