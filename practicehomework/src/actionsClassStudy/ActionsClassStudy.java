package actionsClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClassStudy {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// mouse actions -----> move to element
		
		// 1. create object of action class and pass driver object as parameter
		
		Actions act = new Actions(driver);
		// 2. by using one of the actions class method performed actions
		Thread.sleep(2000);
		
		WebElement mouseuse = driver.findElement(By.id("checkBoxOption2"));
		Thread.sleep(2000);
		
		act.moveToElement(mouseuse).perform();
		Thread.sleep(2000);
	//    act.moveToElement(mouseuse).click().perform();
	
	 	act.moveToElement(mouseuse).click().build().perform();
		
	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 	
		WebElement calender = driver.findElement(By.id("dropdown-class-example"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		act.moveToElement(calender).click().build().perform();
		
	/*	act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		act.sendKeys(Keys.ENTER).perform();
	*/	
		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		// for scroll in to view we make type casting of javascriptexecuter with driver object
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].scrollIntoView(true)", calender);
		
		
		
		
		
		

	}

}
