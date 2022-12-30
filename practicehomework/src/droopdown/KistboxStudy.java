package droopdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KistboxStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

			Thread.sleep(2000);
		    WebElement monthfiled = driver.findElement(By.id("month"));
			         
			Select s = new Select(monthfiled);
			         
			Thread.sleep(1000);
			         
			s.selectByIndex(5);
			         
			 /*   List<WebElement> sd = s.getOptions();
			      Thread.sleep(1000);
			      for(WebElement d:sd) {
			        	
			      System.out.println(d.getText());
			        */	
			        	
			        	
			        }
			         
			         
	}


