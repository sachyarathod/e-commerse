package tableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsMethodused {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
			
			
		 List<WebElement> wholetable = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
	   for(WebElement td:wholetable)
	
	   {
		   System.out.print(td.getText()+" ");
		   System.out.println();
	   }
		
		
		
		
		
		

	}

}
