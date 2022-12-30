package googlePOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlyMethod.CommonlyUseMethod;

public class Googlepage 
{
	
	// find the element or variable on webpage
	@FindBy(xpath = "(//a[@role='button'])[1]")private  WebElement rolebutton;
	
	@FindBy(xpath = "//ul[@class='LVal7b u4RcUd']//li[4]")private WebElement youtubeBt;
	
	// create constructor
	public Googlepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// create method and use of variable
	public  void clickonbutton()
	{
		rolebutton.click();
	}
	
	public void clickonYT(WebDriver driver,String sachin) throws IOException
	{
		youtubeBt.click();
		
		CommonlyUseMethod.takesscreenshot(driver, sachin);
	}
	
	
	

}
