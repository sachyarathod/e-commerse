package ss;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// first open URl
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(1000);
		// i want text Frames Example so find locator and getText
		  String getText = driver.findElement(By.xpath("//li[text()='Frames Example']")).getText();
		  Thread.sleep(1000);
		System.out.println(getText);
		
		// here we switch selenium focus from main page to child frame 
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
	     WebElement frametext = driver.findElement(By.id("topic"));
	     Thread.sleep(1000);
		System.out.println(frametext.getText());
		
		// here we switch selenium focus from child frame to its child frame 
		Thread.sleep(1000);
		driver.switchTo().frame("frame3");
		Thread.sleep(1000);
		driver.findElement(By.id("a")).click();
		
		// in last we switch selenium focus from inner child frame to main page directly by using method switchTo defaultcontent
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
     WebElement mainText = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
     Thread.sleep(1000);
		System.out.println(mainText.getText());

		
		// we switch selenium focus from main page to frame 2
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		WebElement animals = driver.findElement(By.id("animals"));
		     Thread.sleep(1000);
		Select s = new Select(animals);
		
		s.selectByIndex(3);
		
		 List<WebElement> allText = s.getOptions(); 
	/*     Iterator<WebElement> it = allText.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		*/
		for(WebElement al:allText)
		{
			System.out.println(al.getText());
		}
		
		
		
		
		
	}

}
