package insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermLifepolicybazzar
{
	
	// find variable on webpage using @findby annotation
	@FindBy(xpath = "//input[@type='text']") private WebElement namefiled;
	
	@FindBy(xpath = "(//input[@type='tel'])[1]") private WebElement DobField;
	
	@FindBy(xpath = "(//input[@type='tel'])[2]") private WebElement MobileNofield;
	
	@FindBy(xpath = "//span[text()='View Free Quotes ']")private WebElement viewcotation;
	
	// create constructor for initialization of variables
	public TermLifepolicybazzar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entername()
	{
		namefiled.sendKeys("Sachin Rathod");
	}
	
	public void enterBob()
	{
		DobField.sendKeys("20/06/1998");
	}
	
	public void enterMobileNo()
	{
		MobileNofield.sendKeys("9665273282");
	}
	
	public void clickonviewcotation()
	{
		viewcotation.click();
	}
			
		
	
	
	

}
