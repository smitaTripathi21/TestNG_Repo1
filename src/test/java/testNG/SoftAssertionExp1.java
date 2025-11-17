package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExp1 {
	
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("basicelements"));
		//In soft we create Object of SoftAssert
		//In Hard We directly use through the class of hardAssert
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(element.isDisplayed());
		//TO check --> Failed Assertion : called always as last of all assertions
		soft.assertAll();
		driver.quit();
		
	}
}
