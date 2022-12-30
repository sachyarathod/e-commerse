package upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.findElement(By.name("userId")).sendKeys("5MB65E");
		
		driver.findElement(By.name("password")).sendKeys("Sachin@123");
		
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("yob")).sendKeys("1998");
		Thread.sleep(3000);
		 WebElement text = driver.findElement(By.xpath("//div[text()='No, I’m good']"));
		
		System.out.println(text.getText());
		Thread.sleep(1000);
		text.click();
		
		   String ActualText = driver.findElement(By.xpath("//span[text()='sachin r.']")).getText();

		   Thread.sleep(1000);
		   System.out.println(ActualText);
		   
		   String Expecteted = "Sachin R.";
		   
		   if(ActualText.equals(Expecteted))
		   {
			   System.out.println("Username matching TC is passed");
		   }
		   else 
		   {
			   System.out.println("Username not matching TC is failed");
		   }
		   
		   
		   
		   
		   
		   
	}

}
