package neostoxBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	protected static WebDriver driver;
	
	
	public void launchbrowser()
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://neostox.com/");

	}
}
