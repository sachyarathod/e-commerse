package upStoxspomExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxspasscodePage 
{
    @FindBy(id = "yob")  private WebElement yobfield;
	
	// 2. create constructor
	
	public UpstoxspasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterpasscode( )
	{
		yobfield.sendKeys("1998");
	}
	
	
	
	
	
	
	

}
