package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(1000);
		// find element which is present on webpage
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		
		// switching selenium focus from main page to alert popup
		
		Alert alt = driver.switchTo().alert();
		      
		// to handle popup we use alert interface abstract method 
		      
		// 1. getText of alert popup
		      
		System.out.println(alt.getText());
		      
		// here we click on alert popup ok button
		alt.accept();
		      
	    WebElement getText = driver.findElement(By.xpath("//div[text()='Alerts']"));
		Thread.sleep(1000);
		System.out.println(getText.getText());
		     
	}

}
