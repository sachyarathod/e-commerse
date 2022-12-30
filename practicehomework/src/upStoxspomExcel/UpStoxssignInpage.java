package upStoxspomExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxssignInpage 
{
	// declare all variable which we have to use
    @FindBy(name ="userId") private WebElement userId;
	
	@FindBy(name ="password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInbutton;
	
	
	public UpStoxssignInpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String uid)
	{
		userId.sendKeys(uid);
	}
	
	public void enterPassword(String pas)
	{
		password.sendKeys(pas);
	}
	
	public void ClickonSignInbutton()
	{
		signInbutton.click();
	}
	
	
	
	
	

}
