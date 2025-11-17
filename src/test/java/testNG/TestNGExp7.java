package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExp7 {
  @Test
  @Parameters({"UserName" , "Password"})
  public void login(String UserName , String Password) {
	  System.out.println("username :" + UserName  + "Password :" + Password);
  }
}
