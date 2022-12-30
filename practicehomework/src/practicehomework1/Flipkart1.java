package practicehomework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    // open url using get method
	    driver.get("https://www.flipkart.com/");
	    
	    // find element and pass value
	    driver.findElement(By.name("q")).sendKeys("mobile");
	    

	}

}
