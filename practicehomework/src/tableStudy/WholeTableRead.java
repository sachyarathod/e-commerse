package tableStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WholeTableRead {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		for(int i =1;i<=3;i++) {
		
		     String headTd = driver.findElement(By.xpath("//table[@id='product']//tr[1]//th["+i+"]")).getText();
		
		     System.out.print(headTd+" ");
		     
		   
		   
		}
		
		System.out.println();
		for(int i =2;i<=11;i++)
		{
			
			for(int j=1;j<=3;j++) 
			{
				String valuefrom2to10 = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
				
				System.out.print(valuefrom2to10+" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		
		
		
		
		
		
	}

}
