package insurance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PolicyTestclass {
  @Test
  public void policy() 
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
	 
	    // create object of policy bazzar home page
	    Policybazzar p = new Policybazzar(driver);
	    p.clickontermlife();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    // create object of termlifepolicy bazzar page
	    TermLifepolicybazzar term = new TermLifepolicybazzar(driver);
	    term.entername();
	    term.enterBob();
	    term.enterMobileNo();
	    term.clickonviewcotation();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
        // create object of policy bazzar plans
	    Policybazzarplans plan = new Policybazzarplans(driver);
	    plan.clickonviewplans();
	    
	    plan.clickoninsurer();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    plan.clickonclaimbutton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    plan.clickonlifecover();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    plan.clickoncovertillage();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    plan.clickonclaimsettled();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    plan.clickonpaymonthly();
	  
	  
  }
}
