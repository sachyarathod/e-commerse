package neostoxUtilityclass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neostoxBaseclass.Baseclass;

public class Listener extends Baseclass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC"+result.getTestName()+" sucess...",true);
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC"+result.getTestName()+" failed please try again",true);
		try {
			Utilityclass.screenshot(driver, result.getTestName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Tc"+result.getTestName()+" skipped plese cheek");
	}
	 
    
	
}
