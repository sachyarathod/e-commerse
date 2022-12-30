package upStoxsPom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsSecuritiesPage 
{
	
	@FindBy(xpath = "(//div[@class='p7cB0_D8KuO320HW5wMAn _2LGu0XPz7mYgXhRukvReqt']//div)[2]") private WebElement availablefund;
	
	public UpstoxsSecuritiesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void getavailabefund()
	{
		String fundtext = availablefund.getText();
		System.out.println(fundtext);
		
		
		
	}
	
	
	
	
	

}
