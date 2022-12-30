package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement dropdown = driver.findElement(By.xpath("//legend[text()='Dropdown Example']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		Thread.sleep(1000);
;		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Automation testing");

		Thread.sleep(1000);
		 WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		
		 Thread.sleep(1000);
		 radio2.click();
		 System.out.println(radio2.isSelected());
		 Thread.sleep(1000);
		 driver.findElement(By.id("hide-textbox")).click();
		 Thread.sleep(1000);
		 WebElement hide = driver.findElement(ByCssSelector.name("show-hide"));
		 
		 System.out.println(hide.isDisplayed());
		 Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		 
		System.out.println(text);
		
		
	}

}
