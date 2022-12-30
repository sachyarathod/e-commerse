package droopdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraStudy {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/shirt-men");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ul[@class='brand-list']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@class='colour-listItem'])[2]")).click();

			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite filter-se')])[2]")).click();
			
	}

}
