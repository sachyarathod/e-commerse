package droopdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args)
	{
		
       System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium velocity\\\\chromedriver.exe");
		
       
       // create object of chrome option class 
       ChromeOptions ch = new ChromeOptions();
       
       // call add argumrnts method and here we add the arguments
       ch.addArguments("incognito");
       
       
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement searchtext = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(searchtext);
		
		s.selectByIndex(2);
		
        List<WebElement> ls = s.getOptions();
		
		System.out.println(ls.size());
		
	/*	for(WebElement l:ls)
		{
			System.out.println(l.getText());
		}
		*/
	//	for()
		
		     Iterator<WebElement> l = ls.iterator();
		
		     while(l.hasNext())
		     {
		    	 System.out.println(l.next().getText());
		     }
		

	}

}
