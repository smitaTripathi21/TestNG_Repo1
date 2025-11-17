package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		WebElement registrationLink = driver.findElement(By.id("registration2"));
		registrationLink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userName = driver.findElement(By.id("unameSignin"));
		if(userName.isDisplayed() && userName.isEnabled())
			userName.sendKeys("asfafa");
		
		userName.clear();
		driver.close();
	}
}
