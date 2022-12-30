package studysel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudySelenium {

	public static void main(String[] args)
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium velocity\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://youtube.com/");
		
		driver.close();
		
		
		
	}

}
