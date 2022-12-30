package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	//	driver.close();
		
	//	driver.quit();  used for close all the browser open by selenium tool
		
		// navigate method 
		
		driver.navigate().to("https://flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		// get title method 
		
		
		    String Title = driver.getTitle();
		
		    System.out.println("the title is "+Title);
		    
	 // get currentURL
		
		     String currentURL = driver.getCurrentUrl();
		
		System.out.println("The current URL is "+currentURL);
		
		// check test case 1 
		
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		
		String actualTitle = driver.getTitle();
		
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("test case is passed");
		}
		else 
		{
			System.out.println("test case is failed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
