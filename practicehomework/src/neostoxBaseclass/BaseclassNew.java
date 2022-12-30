package neostoxBaseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neostoxUtilityclass.Utilityproperties;

public class BaseclassNew 
{
	protected static WebDriver driver;
	
	
	public void launchbrowser()throws IOException
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(Utilityproperties.readDataFromPropertyFile("url"));

	}
}
