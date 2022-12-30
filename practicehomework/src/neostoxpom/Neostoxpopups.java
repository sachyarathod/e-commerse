package neostoxpom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Neostoxpopups
{
	@FindBy(xpath = "(//span[text()='Hi Sachin Rathod'])[1]")private WebElement userid;
	@FindBy(xpath = "(//span[text()='×'])[19]")private WebElement Xsymbol;
	
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closebutton;
	
	public Neostoxpopups(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void cliclonXsymbol()
	{
		Xsymbol.click();
	}
	public void clickonclosebutten()
	{
		closebutton.click();
		
	}
}
