package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsPasscodePage 
{
	
	// 1. declare variables 
	
	@FindBy(id = "yob")  private WebElement yobfield;
	
	// 2. create constructor
	
	public UpstoxsPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3. uasges
	
	public void enteryob()
	{
		yobfield.sendKeys("1998");
	}
	

}
