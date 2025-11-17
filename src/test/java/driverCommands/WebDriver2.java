package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://automationbykrishna.com/");
		
		
//		WebElement register_Button = driver.findElement(By.id("registration2"));
//		register_Button.click();
		
//		Thread.sleep(2000);
		
//		WebElement user_Name = driver.findElement(By.id("unameSignin"));
//		user_Name.sendKeys("Mehul");
		
//		WebElement password = driver.findElement(By.id("pwdSignin"));
//		password.sendKeys("Mehul");
		
//		WebElement full_Name = driver.findElement(By.name("fName"));
//		full_Name.sendKeys("Mehul ghar");
		
//		WebElement full_Name = driver.findElement(By.className("form-control"));
//		full_Name.sendKeys("Mehul ghar");
		
		
//		WebElement register = driver.findElement(By.linkText("Registration"));
//		register.click();
		
		WebElement register = driver.findElement(By.partialLinkText("Registr"));
		register.click();
		
		//tagName are many thats why we avoid using it
//		WebElement register = driver.findElement(By.tagName("ul"));
//		register.click();
		
		//XPath -- XML Path --> To capture dynamic WEBELEMENTS (Sel and UFT)
		// Works from Root to child 
		//CSS Selector --> using the css name as a locator to the css elements
		
		Thread.sleep(2000);
		
		
		
		
		
		
	}
}
