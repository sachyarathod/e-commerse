package tableStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy {

	public static void main(String[] args)
	
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			String row2Text = driver.findElement(By.xpath("//table[@id='product']//tr[2]")).getText();
			
			System.out.println(row2Text);
			System.out.println("===========================================");
			
			for(int i =1;i<=3;i++) {
			  String row10tbdata = driver.findElement(By.xpath("//table[@id='product']//tr[10]/td["+i+"]")).getText();
			
			System.out.println(row10tbdata);
			}
			
			System.out.println("==================");
	    String text = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[2]")).getText();
			
			System.out.println(text);
			System.out.println("==================");
			
			for(int i =1;i<=3;i++) {
			   String row5 = driver.findElement(By.xpath("//table[@id='product']//tr[5]/td["+i+"]")).getText();
			
			System.out.println(row5);
			}
			

	}

}
