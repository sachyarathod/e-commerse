package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {

	public static void main(String[] args)

	{
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
	  WebElement mainPagetext = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		
       
		    System.out.println(mainPagetext.getText());  // nested frames
		    
		    driver.switchTo().frame("frame1");
		    
    String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		    
		  
		    System.out.println(parenttext);  // parent frame
		    
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		    
		  String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		    
		    
		    System.out.println(childtext);  // child text
		    
		    driver.switchTo().defaultContent();
		    
		    
		    
		    
	}

}
