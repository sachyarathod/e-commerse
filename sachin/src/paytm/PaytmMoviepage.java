package paytm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaytmMoviepage
{
	
    @FindBy(xpath = "(//span[text()='Hindi'])[1]")private WebElement hindimovie;
	
	@FindBy(xpath = "(//span[text()='Marathi'])[1]")private WebElement marathimovie;
	
	@FindBy(xpath = "(//div[@class='lazyload-wrapper '])[1]")private WebElement actionhero;
	
	
	public PaytmMoviepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonhindimovie()
	{
		hindimovie.click();
	}
	public void clickmarathimovie()
	{
		marathimovie.click();
	}
	
	   WebDriver driver = new ChromeDriver();
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	public void clickonaction()
	{
		js.executeScript("arguments[0].scrollIntoView(true)", actionhero);
		actionhero.click();
	}

}
