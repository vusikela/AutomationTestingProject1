package TestNglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestPageLayer.SubscribeNews2;

public class CustomListener extends SubscribeNews2 implements ITestListener
{
	/*I think you know very vell, in TestNG we have one lister is there, that is  ITestListener
	 * This Class is, I am used for the my particlualr test script is passed or failed or skipped purpose.
	 * 
	 * 
	 */

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test scripts are failed");
		failed(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
   
	
	

}
