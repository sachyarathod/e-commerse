package setSizesetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		// how to get size
		
		Dimension defaultsize = driver.manage().window().getSize();
		
		System.out.println(defaultsize);
		
		// to set size we need to create object of dimension class and pass width and height
		
		Dimension d = new Dimension(1200, 252);
		
		driver.manage().window().setSize(d);
		
		// to set size we need to create object of dimension class and pass width and height values
		
		Dimension d1 = new Dimension(20, 900);
		
		driver.manage().window().setSize(d1);
		
		
		
		
		
		
		
		
		
		

	}

}
