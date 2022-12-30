package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy3 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/guru99home/");
			Thread.sleep(1000);
			driver.switchTo().frame("//iframe[@height=\"315\"]");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[text()='Watch on']")).click();
	}

}
