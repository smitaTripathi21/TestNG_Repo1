package testNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListnerExp1 implements ITestListener{
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener : Test Passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Listener : Test Failed");	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener : Test Skipped");
	}
	
	
	public void onStart(ITestContext context) {
		System.out.println("Listener : Test Started");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Listener : Test Finished");
	}
	

}
