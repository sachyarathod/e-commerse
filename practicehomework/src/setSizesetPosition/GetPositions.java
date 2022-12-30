package setSizesetPosition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Point gefaultposition = driver.manage().window().getPosition();
		
		System.out.println(gefaultposition);
		
		// to set position of browser we need to create object of point class 
		Thread.sleep(1000);
		Point p = new Point(13, 6);
		
		driver.manage().window().setPosition(p);
		
		Thread.sleep(1000);
		Point p1 = new Point(130, 5);
		
		driver.manage().window().setPosition(p1);
		
		// for scrolling 1st we have do type cast of java script executer with driver
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
	    WebElement getText = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		Thread.sleep(1000);
		System.out.println(getText.getText());
		js.executeScript("arguments[0].scrollIntoView(true)",getText);

	}

}
