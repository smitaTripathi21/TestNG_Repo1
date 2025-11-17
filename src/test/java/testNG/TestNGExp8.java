

	
package testNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListnerExp1.class)
public class TestNGExp8 {
	
  @Test(enabled=false)
  public void PayementTest() {
	  System.out.println("Payement Method");  
  }
  
  

  @Test(expectedExceptions=ArithmeticException.class)
  public void BilingTest() throws InterruptedException {
	  System.out.println("Biling Method");  
	  throw new ArithmeticException();
  }
}

