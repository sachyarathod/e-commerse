package paytm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paytmmovie
{
	
	@FindBy(xpath = "(//a[text()='Pune'])[1]")private WebElement cityname;
	
	public Paytmmovie(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickoncityname()
	{
		cityname.click();
	}
}
