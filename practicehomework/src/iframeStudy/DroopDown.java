package iframeStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroopDown {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/select-menu");
			
			 driver.findElement(By.xpath("//div[text()='Select Title']")).click();

			 Thread.sleep(1000);
			 WebElement Listbox = driver.findElement(By.id("oldSelectMenu"));
			 
			 Select s = new Select(Listbox);
			 Thread.sleep(1000);
			 
			 s.selectByIndex(5);
			
			    List<WebElement> text = s.getOptions();
			
			     Iterator<WebElement> it = text.iterator();
			     
			   while(it.hasNext())
			   {
				   System.out.println(it.next().getText());
			   }
			
	}

}
