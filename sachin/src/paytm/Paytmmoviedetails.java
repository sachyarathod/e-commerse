package paytm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paytmmoviedetails
{
	@FindBy(xpath = "//div[@class='DesktopMovieInfo_gradient__Dvy1d']")private WebElement playbutton;
	
	
	public Paytmmoviedetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonplaybutton()
	{
		playbutton.click();
	}

}
