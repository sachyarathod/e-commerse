package neostoxpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlyMethod.CommonlyUseMethod;

public class NeostoxHomepage 
{
    @FindBy(xpath = "(//span[text()='×'])[19]")private WebElement Xsymbol;
	
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closebutton;
	
	@FindBy(xpath = "(//span[text()='Hi Sachin Rathod'])[1]")private WebElement userid;
	
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logout;
	
	public NeostoxHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getactualuserid(WebDriver driver) throws IOException
	{
		 String actualuserid = userid.getText();
		 CommonlyUseMethod.impliciteWait(driver);
		 // for scroll in to view we use commonly method
		 CommonlyUseMethod.scrollinToview(driver, userid);
		 // for wait we use commonly implicit wait method 
		 CommonlyUseMethod.impliciteWait(driver);
		 // to take screen shot we use commonly method
		 CommonlyUseMethod.takesscreenshot(driver, actualuserid);
		 
		 return actualuserid;
	}
	
	public void clickonXsymbol()
	{
		Xsymbol.click();
	}
	public void clickonclose()
	{
		closebutton.click();
	}
	public void clickonlogoutbutton()
	{
		logout.click();
	}
	

}
