package paytm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paytmhomepage 
{
	@FindBy(xpath = "(//div[@class='_2EGQY'])[1]")private WebElement movieticket;
	
	
	
	public Paytmhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmovieticket()
	{
		movieticket.click();
	}

}
