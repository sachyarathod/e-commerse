package policybazzar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestclassPolicy {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://health.policybazaar.com/");
		
		// create object of sign in page and call method 
		SignInPage sign = new SignInPage(driver);
		sign.clickonspouse();
		sign.clickonson();
		sign.clickoncontinue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// create object of age page and call methods
		Agepage ag = new Agepage(driver);
		ag.clickonyourage(driver);
		ag.clickonspouseage(driver);
		ag.clickonsonage(driver);
		ag.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// create object of city class
		Citypage c = new Citypage(driver);
		c.clickonpune();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// create object of personal details class
		Personalde p = new Personalde(driver);
		p.entername();
		p.entermobileNo();
		p.clickoncontinuebutton();
		Thread.sleep(5000);
		
	}

}
