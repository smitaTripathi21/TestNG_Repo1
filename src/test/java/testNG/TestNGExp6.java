package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TestNGExp6 {
	
  @Test(groups= {"sanity"})
  public void PayementTest() {
	  System.out.println("Payement Method");  
  }
  
  @Test(groups= {"smoke"})
  public void LoginTest() {
	  System.out.println("Login Method");
  }

  @Test(groups= {"sanity"})
  public void BilingTest() {
	  System.out.println("Biling Method");
  }

  @Test(groups= {"smoke, Regression"})
  public void RegistrationTest() {
	  System.out.println("Registration Method");
  }

}
