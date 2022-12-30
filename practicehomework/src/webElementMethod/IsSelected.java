package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.findElement(By.xpath("//input[@value='Radio2']")).click();
			
			      WebElement IsSelected = driver.findElement(By.xpath("//input[@value='Radio2']"));

			      System.out.println(IsSelected.isSelected());
			      
			   driver.findElement(By.id("checkBoxOption1")).click();
			   Thread.sleep(1000);
			   driver.findElement(By.id("checkBoxOption2")).click();
			   Thread.sleep(1000);
			   driver.findElement(By.id("checkBoxOption3")).click();
			   Thread.sleep(1000); 
			      
			   System.out.println(IsSelected.isSelected());
	}

}
