package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("https://vctcpune.com/");
		
	//	driver.close();
		
	//	driver.quit(); close all tab present in browser opened by selenium tool
		
		
		 // driver.manage().window().maximize();
	//	Thread.sleep(500);
	//	driver.manage().window().minimize();
		
		
		driver.navigate();
		
		
		
		
		
		
		
		
		
		
	}

}
