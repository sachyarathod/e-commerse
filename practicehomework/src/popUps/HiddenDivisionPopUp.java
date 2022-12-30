package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		
		
		 WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Get access ')]"));

		 System.out.println(text.getText());
		     
		 WebElement closeSymbol = driver.findElement(By.xpath("//button[text()='✕']"));
		 Thread.sleep(500);
		 closeSymbol.click();
		     
		 System.out.println("=================================");
		 System.out.println(text.getText());
		     
		     
		     
		     
		     
	}

}
