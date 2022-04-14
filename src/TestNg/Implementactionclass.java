package TestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Implementactionclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("on TestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" on TestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" on TestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" on TestSkipped");
	}

}
