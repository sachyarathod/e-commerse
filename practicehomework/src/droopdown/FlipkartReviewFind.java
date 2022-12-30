package droopdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReviewFind {

	public static void main(String[] args) throws InterruptedException 
	{
          System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


		Thread.sleep(2000);
		String getText = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		Thread.sleep(1000);
		System.out.println("Todays reviews"+getText);
		
		
	}

}
