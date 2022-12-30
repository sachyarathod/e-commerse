package Variable_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		// following are the webelement methods
		
		// for scroll in to view 
		
		WebElement textField = driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", textField);
		Thread.sleep(500);
		textField.sendKeys("Automation class");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		WebElement getText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		Thread.sleep(500);
		String value = getText.getText();
		System.out.println("text is :-"+value);
	}

}
