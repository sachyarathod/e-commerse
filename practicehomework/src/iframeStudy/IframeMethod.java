package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeMethod {

	public static void main(String[] args) throws InterruptedException 
	
	{

        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframe-name");// switching selenium focus from main page to iframe page
		
		WebElement getText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]"));	
		
         System.out.println(getText.getText());
         
         driver.switchTo().defaultContent(); // switching selenium focus from iframe page to main page
         
         driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
         
        Thread.sleep(1000);
         
         driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Sachin");
         
	}

}
