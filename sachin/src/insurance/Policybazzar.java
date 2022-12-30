package insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policybazzar
{
	// declare variable or webelement with private access specifier
	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[1]")private WebElement termLifeins;
	
	// declare constructor with public access specifier and initialize variable in constructor
	public Policybazzar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// use of variable
	public void clickontermlife()
	{
		termLifeins.click();
	}
	
	

}
