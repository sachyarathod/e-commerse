package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//  click method is used for click any  checkbox 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
	  driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	  
	  
	      WebElement radiocheck = driver.findElement(By.xpath("//input[@value='Radio3']"));
	  
	      radiocheck.click();

	}

}
