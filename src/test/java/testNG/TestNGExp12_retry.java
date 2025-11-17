package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExp12_retry {
	
	@Test(retryAnalyzer = IRetryClass.class)
	public void login() {
		System.out.println("Login Test");
		Assert.assertTrue(false);
	}
}
