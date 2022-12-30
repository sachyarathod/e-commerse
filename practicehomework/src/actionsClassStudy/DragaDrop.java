package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaDrop {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		// to perform action drag and drop 1st we find the element and store in relerance variable source and destination
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		// create object of action class and pass driver as a agruments
		Actions act = new Actions(driver);
		
		// here we use method of action class dragAnddrop method
		act.dragAndDrop(source, destination).build().perform();
		
		WebElement sour = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.moveToElement(sour).clickAndHold().release(dest).build().perform();
		
		
		
		
		

	}

}
