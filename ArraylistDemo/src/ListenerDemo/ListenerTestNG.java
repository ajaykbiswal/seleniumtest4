package ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCase FAILED and Test Case Details are: "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase Skipped and Test Case Details are: "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase Started and Test Case Details are: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase Passed and Test Case Details are: "+result.getName());
		
	}
	
	
	

}
