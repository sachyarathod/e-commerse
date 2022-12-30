package neostoxPomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neostoxUtilityclass.Utilityclass;

public class NeostoxLoginpage
{
    @FindBy(linkText = "Sign In")private WebElement signinbutton;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement monofiled;
	
	@FindBy(id = "lnk_signup1")private WebElement signinbutt;
	
	
	public NeostoxLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicKonsigninbutton(WebDriver driver)
	{
		Utilityclass.wait(driver, 1000);
		signinbutton.click();
	}
	public void EnterMobilenumber(WebDriver driver,String Mobnumber)
	{
		Utilityclass.wait(driver, 1000);
		 monofiled.sendKeys(Mobnumber);
	}
	public void clickonsigninbutton2(WebDriver driver)
	{
		Utilityclass.wait(driver, 1000);
		signinbutt.click();
	}

}
