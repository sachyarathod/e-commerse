package droopdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	  WebElement listBox = driver.findElement(By.xpath("dropdown-class-example"));
		Thread.sleep(1000);
		Select s = new Select(listBox);
		
		s.selectByIndex(2);
		Thread.sleep(1000); 
		List<WebElement> t = s.getOptions();
		
		Iterator<WebElement> it = t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
