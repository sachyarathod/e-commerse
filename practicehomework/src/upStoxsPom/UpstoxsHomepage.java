package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsHomepage
{
	
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement usernametext;
	
	@FindBy(id = "funds") private WebElement  fundsbutton;
	
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logoutbutton;
	
	public UpstoxsHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Gettextofusername()
	{
		   String Actualtext = usernametext.getText();
		
		   System.out.println(Actualtext);
		   String Expected = "Sachin R.";
		   
		   if(Actualtext.equals(Expected))
		   {
			   System.out.println("String Actualtext and expected text are matching TC is passed");
		   }
		   else
		   {
			   System.out.println("String Actualtext and expected text are not matching TC is failed");
		   }
		   
	}
	
	public void clickonFunds()
	{
		fundsbutton.click();
	}
	
	public void Clickonusername()
	{
		usernametext.click();
	}
	
	
	public void clickonlogoutbutton()
	{
		logoutbutton.click();
	}
	

}
