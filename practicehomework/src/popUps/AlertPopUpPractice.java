package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpPractice {

	public static void main(String[] args) throws InterruptedException
	{
         System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
         // here we create object of chromeDriver taking referance of webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url we use get method
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
        WebElement text = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		
        System.out.println(text.getText());
        Thread.sleep(1000);
        driver.findElement(By.id("alertBox")).click();
        
        // to handle alert popup we need to switch selenium focus from main page to alert popup
        Thread.sleep(1000);
           Alert alt = driver.switchTo().alert();
           Thread.sleep(1000);
	//	alt.sendKeys("Sachin");
		
		alt.accept();
		
		       Thread.sleep(1000);
		       WebElement clickbutton = driver.findElement(By.id("confirmBox"));
		       Thread.sleep(1000);
		       clickbutton.click();
		        Alert al = driver.switchTo().alert();

		        Thread.sleep(1000);
		        System.out.println(al.getText());
		        Thread.sleep(1000);
		        al.accept();
		        
	}

}
