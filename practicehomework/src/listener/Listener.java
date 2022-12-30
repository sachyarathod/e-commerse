package listener;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
	     String tName = result.getName();
		Reporter.log("TC "+tName+ " sucess.....",true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+ " failed plese try again.....",true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC " +result.getName()+" skipped please check", true);
	}
	
}
