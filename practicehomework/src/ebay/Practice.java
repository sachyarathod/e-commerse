package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
        WebElement getText = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
        Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(getText).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
		//act.click().perform();

	}

}
