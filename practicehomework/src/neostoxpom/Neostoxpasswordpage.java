package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Neostoxpasswordpage 
{
	
	@FindBy(id = "txt_accesspin")private WebElement passwordfield;
	
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submitbutton;
	
	public Neostoxpasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpasswordfiled()
	{
		passwordfield.sendKeys("1234");
	}
	
	public void clickonsubmitbutton()
	{
		submitbutton.click();
	}

}
