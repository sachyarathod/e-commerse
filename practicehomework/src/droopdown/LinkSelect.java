package droopdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSelect {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		   
		   System.out.println(links.size());
		   
		   for(WebElement l:links)
		   {
			   System.out.println(l.getText());
		   }
		   
		   
		   
		   

	}

}
