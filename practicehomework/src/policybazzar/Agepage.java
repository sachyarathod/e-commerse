package policybazzar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agepage 
{
	
	@FindBy(id = "Self")private WebElement yourage;
	@FindBy(id = "Spouse")private  WebElement spouseage;
	@FindBy(id = "Son")private WebElement sonage;
	@FindBy(id = "submitButton") private WebElement continuebuttin;
	
	public Agepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonyourage(WebDriver driver)
	{
		 yourage.click();
		 Actions act = new Actions(driver);
		 for(int i=0;i<=7;i++)
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
			}
	    act.sendKeys(Keys.ENTER).perform();
	
	}
	public void clickonspouseage(WebDriver driver)
	{
		spouseage.click();
		Actions act = new Actions(driver);
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickonsonage(WebDriver driver)
	{
		sonage.click();
		Actions act = new Actions(driver);
		
		for(int i=0;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickoncontinuebutton()
	{
		continuebuttin.click();
	}
	

}
