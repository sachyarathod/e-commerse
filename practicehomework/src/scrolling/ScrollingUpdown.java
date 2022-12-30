package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		// for scrolling first we have type cast javascriptExecuter with driver objects
		
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("window.scrollBy(0,900)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,-300)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		
		
		
		

	}

}
