package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsWelcomePage 
{
	
	// declare variables 
	
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement Noimgood;
	
	// create constructor 
	
	public UpstoxsWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// usages
	
	public void clickonNoimgood()
	{
		Noimgood.click();
	}
	
	
	
	
	

}
