package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neostoxsigninpage 
{
	// declare variable with @findby annotation 
	@FindBy(linkText = "Sign In")private WebElement signinbutton;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement monofiled;
	
	@FindBy(id = "lnk_signup1")private WebElement signinbutt;
	
	// declare constructor with public specifier
	public Neostoxsigninpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// here we use  that variable in method
	public void clickonsigninbutton()
	{
		signinbutton.click();
	}
	public void entermono()
	{
		monofiled.sendKeys("7447501350");
	}
	public void clickonsignbutton()
	{
		signinbutt.click();
	}

}
