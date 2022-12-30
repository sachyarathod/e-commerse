package neostoxpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonlyMethod.CommonlyUseMethod;

public class NeostoxTestNGTestClass {
  @Test
  public void testing() throws IOException, InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
	  
	  // create object of chromedriver taking reference of webdriver interface
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://neostox.com/");
	  
	  // create object of neostox sign in page
	  Neostoxsigninpage sign = new Neostoxsigninpage(driver);
	  sign.clickonsigninbutton();
	  sign.entermono();
	  sign.clickonsignbutton();
	  
	  CommonlyUseMethod.impliciteWait(driver);
	  // create object of password page
	  Neostoxpasswordpage password = new Neostoxpasswordpage(driver);
	  password.enterpasswordfiled();
	  Thread.sleep(3000);
	  password.clickonsubmitbutton();
	  
	  CommonlyUseMethod.impliciteWait(driver);
	 
	  // create object of home page
	  NeostoxHomepage home = new NeostoxHomepage(driver);
	  home.getactualuserid(driver);
	  CommonlyUseMethod.impliciteWait(driver);
	  
	  // create object of popups page
	  Neostoxpopups pop = new Neostoxpopups(driver);
	  pop.cliclonXsymbol();
	  CommonlyUseMethod.impliciteWait(driver);
	  pop.clickonclosebutten();
	  
  }
}
