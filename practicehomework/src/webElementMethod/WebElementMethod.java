package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		 
		 
		//   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("mobile");
		
		
	//	WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		
	//    findElement.sendKeys("Sachin");
	//	     Thread.sleep(1000);
		     
		//     findElement.clear();
		     
		//     Thread.sleep(1000); 
		//     findElement.sendKeys("1234567");
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mens wear");
		
		Thread.sleep(1000);
		
		WebElement SearchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		

		SearchText.clear();
		
		
		
		
		
	}

}
