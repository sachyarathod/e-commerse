package upStoxspomExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlyMethod.CommonlyUseMethod;

public class UpstoxsHomepage
{
    @FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement usernametext;
	
	@FindBy(id = "funds") private WebElement  fundsbutton;
	
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logoutbutton;
	
	public UpstoxsHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserid(String Exuid,WebDriver driver) throws IOException
	{
		 String Actualuserid = usernametext.getText();
		 
		 //for  scrollintoView we use common method
		 
		 CommonlyUseMethod.scrollinToview(driver, fundsbutton);
		 //to take screenshot we use common method
		 
		 CommonlyUseMethod.takesscreenshot(driver, Actualuserid);
		 
		 if(Actualuserid.equals(Exuid))
		 {
			 System.out.println("Actualuserid and expectedUserid are matching TC is passed ");
		 }
		 else
		 {
			 System.out.println("Actualuserid and expectedUserid are not matching TC is failed ");
		 }
		 
	}
	
	public void clickonFundsbutton()
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
	
	public String getActualusID(WebDriver driver) throws IOException
	{
		 String actualUID = usernametext.getText();
		 // scroll to UsID we use scroll in to view 
		 CommonlyUseMethod.scrollinToview(driver, fundsbutton);
		 
		 // to take screenshot of userID we use screenshot method
		 CommonlyUseMethod.takesscreenshot(driver, actualUID);
		 return actualUID;
	}
	
	
	
	
	
	

}
