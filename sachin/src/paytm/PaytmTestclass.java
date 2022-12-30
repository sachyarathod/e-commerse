package paytm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaytmTestclass {
  @Test
  public void paytm() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com");
	  
	  // create object of paytm home class
	  Paytmhomepage home = new Paytmhomepage(driver);
	  home.clickonmovieticket();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  // create object of paytm movie page
	  Paytmmovie p = new Paytmmovie(driver);
	  p.clickoncityname();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  // create object of movie page 
	  PaytmMoviepage movie = new PaytmMoviepage(driver);
	  movie.clickonhindimovie();
	  movie.clickmarathimovie();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  movie.clickmarathimovie();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  // create object of movie details page
	  Paytmmoviedetails md = new Paytmmoviedetails(driver);
	  md.clickonplaybutton();
	  
	  
	  
	  
  }
}
