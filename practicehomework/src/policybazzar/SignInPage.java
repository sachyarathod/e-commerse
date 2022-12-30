package policybazzar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	
	 @FindBy(xpath = "(//i[@class='checkbox'])[2]")  private WebElement spouse;
	 @FindBy(xpath = "(//i[@class='checkbox'])[3]")  private WebElement son;
	 @FindBy(id = "submitButton") private WebElement continueButton;

	 
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void clickonspouse()
	{
		spouse.click();
	}
	 public void clickonson()
	 {
		 son.click();
	 }
	 public void clickoncontinue()
	 {
		 continueButton.click();
	 }
	 
	 
}
