package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Personalde
{
	
	@FindBy(id = "fullname")private WebElement namefield;
	
	@FindBy(id = "pmobile" )  private WebElement mobilefield;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebu;
	
	public Personalde(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entername()
	{
		namefield.sendKeys("Sachin Rathod");
	}
	public void entermobileNo()
	{
		mobilefield.sendKeys("9665273282");
	}
	public void clickoncontinuebutton()
	{
		continuebu.click();
	}
	

}
