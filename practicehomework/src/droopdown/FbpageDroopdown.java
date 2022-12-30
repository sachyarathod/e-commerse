package droopdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class FbpageDroopdown {

	public static void main(String[] args) throws InterruptedException
	
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		       List<WebElement> searchbar = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		              
		       Thread.sleep(2000);
		       
		      System.out.println(searchbar.size());
		       
		      for(WebElement sb:searchbar)
		      {
		    	  System.out.println(sb.getText());
		    	  
		    	  String actual =sb.getText();
		    	  
		    	  String expected ="iphone 13 pro";
		    	  
		    	  if(expected.equals(actual))
		    	  {
		    		 sb.click();
		    		 break;
		    	  }
		    	  
		      }
		       
		      driver.findElement(By.linkText("Images")).click();
		       
		       
		       
	}

}
