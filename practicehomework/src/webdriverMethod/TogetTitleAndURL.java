package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TogetTitleAndURL {

	public static void main(String[] args) throws InterruptedException
	{

		
       System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	    	driver.get("https://vctcpune.com/");
		
		    String myTitle = driver.getTitle(); // for title 
	
		    System.out.println(myTitle);
		
		  String currentURL = driver.getCurrentUrl(); // for url
		
		
		System.out.println(currentURL);
		
		
		
		

	}

}
