package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v102.runtime.model.ConsoleAPICalled.Type;
import org.openqa.selenium.support.ui.Select;

public class DroopDownHanddle {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			  WebElement DropDownHanddle = driver.findElement(By.id("dropdown-class-example"));
			
                 Select s = new Select(DropDownHanddle);
                 
                 s.selectByValue("option1");
                 
                 Thread.sleep(1000);
                 
                 s.selectByVisibleText("Option2");
                 
                 Thread.sleep(2000);
                 s.selectByIndex(3);
                 
                 driver.findElement(By.id("checkBoxOption2")).click();
                 
                 
                                 
                 
                 
	}

}
