package upStoxsPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsLoginPage 
{
	// Declare variables (Variables = elements)

	// 1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(name ="userId") private WebElement userId;
	
	@FindBy(name ="password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInbutton;
	
	// 2. Initialize within a constructor with access level public using pagefactory 
	
	// decleae constructor
	
	public UpstoxsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
		
	}
	
	// usages
	
	public void enterUserId(String uid) throws InterruptedException
	{
		userId.sendKeys(uid);
		Thread.sleep(1000);
	}
	
	public void enterPassword()
	{
		password.sendKeys("Sachin@123");
	}
	
	public void clickOnSigninbutton()
	{
		signInbutton.click();
	}
	
	
	
}
