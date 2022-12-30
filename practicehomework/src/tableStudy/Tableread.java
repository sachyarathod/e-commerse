package tableStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableread {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		
		// create object of chrome driver tacking referance of webdriver interface
		WebDriver driver = new ChromeDriver();
		
		// to open application we use wed driver get method 
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// to read data from table first we find locator of table 
		 String value = driver.findElement(By.xpath("(//table[@class='table-display']//tbody//tr)[4]")).getText();
		
		 System.out.println(value);
		 System.out.println("==========================");
		 WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));
		 
		 // for scroll in to view we use javascriptexecuter
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].scrollIntoView(true)",table );
		  Thread.sleep(500);
		 
		 // i want to find data from 10th row
		 
		 for(int i=1;i<=3;i++)
		 {
	
		 String rowdata = driver.findElement(By.xpath("//table[@class='table-display']//tbody//tr[10]//td["+i+"]")).getText();
		 System.out.println(rowdata); 
	}
		 
		 // i want to read data from 6th row 
		 for(int i=1;i<=3;i++)
		 {
			String tdata = driver.findElement(By.xpath("//table[@class='table-display']//tbody//tr[6]/td["+i+"]")).getText();
		
		 System.out.println(tdata);
		 }
		 System.out.println("==================================================");
		 // i want read only header from table
		 for(int i=1;i<=3;i++)
		 {
			 
		  String tableHeader = driver.findElement(By.xpath("//table[@id='product']//tr//th["+i+"]")).getText();
		 
		  System.out.print(tableHeader+" ");
		 }
		
		 
	}

}
