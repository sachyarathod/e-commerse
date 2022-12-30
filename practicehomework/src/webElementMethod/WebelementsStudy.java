package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsStudy {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(1000);
			 WebElement Store = driver.findElement(By.id("checkBoxOption2"));
        
			 Store.click();
			 
			Thread.sleep(1000);
			
			System.out.println(Store.isSelected());
			
			
		   String text = driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText();
			
			System.out.println(text);
			
			
			driver.findElement(By.id("autocomplete")).sendKeys("Sachin Rathod");
			
			driver.findElement(By.id("autocomplete")).clear();
			
			
			
			
	}

}
