package testNG;

import org.testng.annotations.Test;

public class TestNGExp5 {
	
	//Count to 5 Count and does the process
	@Test(invocationCount=5)
	public void payementTest() {
		System.out.println("payement Test");
	}
	
	//Wait for 2 Sec and if not loaded it --> gets Failed
	@Test(timeOut=2000)
	public void BilingTest() throws InterruptedException {
		System.out.println("Biling test");
		Thread.sleep(3000);
	}
}
