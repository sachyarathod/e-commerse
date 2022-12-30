package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
		
			driver.findElement(By.id("show-textbox")).click();
			Thread.sleep(1000);
		//	driver.findElement(By.id("hide-textbox")).click();
			Thread.sleep(1000);
			WebElement ShowText = driver.findElement(By.id("show-textbox"));
		
			System.out.println(ShowText.isDisplayed());
		
	}

}
