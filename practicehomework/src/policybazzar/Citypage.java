package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Citypage 
{
	
	@FindBy(xpath = "//span[text()='Pune']")private WebElement punecity;
	
	public Citypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonpune()
	{
		punecity.click();
	}

}
