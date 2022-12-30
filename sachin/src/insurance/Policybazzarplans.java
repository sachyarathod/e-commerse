package insurance;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policybazzarplans
{
	
	@FindBy(xpath = "//li[text()=' Insurer ']")private WebElement insurerbutton;
	
	@FindBy(xpath = "//span[text()='View Plans ']")private WebElement viewplans;
	
	@FindBy(xpath = "//button[@class='close']")private WebElement  claimbutton;
	
	@FindBy(xpath = "//span[text()='Life Cover']")private WebElement LifecoverDropdown;
	
	@FindBy(xpath = "//span[text()='Cover till age']")private WebElement coverTillage;
	
	@FindBy(xpath = "//li[text()='Claim Settled ']") private WebElement claimsettled;
	
	@FindBy(xpath = "//label[@class='switch']")private WebElement paymonthly;
	
	public Policybazzarplans(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickoninsurer()
	{
		insurerbutton.click();
	}
	public void clickonviewplans()
	{
		viewplans.click();
	}
	
	public void clickonclaimbutton()
	{
		claimbutton.click();
	}
	
	// to handle dropdown create object of actions class
	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	
	public void clickonlifecover()
	{
		LifecoverDropdown.click();
		for(int i =0;i<=8;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
	}
	
	public void clickoncovertillage()
	{
		coverTillage.click();
		for(int i =0;i<=15;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
	}
	
	public void clickonclaimsettled()
	{
		claimsettled.click();
	}
	
	public void clickonpaymonthly() 
	{
		paymonthly.click();
	}
	
	
	
	

}
