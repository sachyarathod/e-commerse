package ebay;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sql {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_where");

		driver.findElement(By.xpath("//button[text()='Restore Database']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).click();
		
		//driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).clear();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("select * from Customers;");
		
	
	}

}
