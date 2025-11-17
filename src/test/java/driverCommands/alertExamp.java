package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExamp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("basicelements")).click();
		driver.findElement(By.id("UserFirstName")).sendKeys("Mehul");
		driver.findElement(By.id("UserLastName")).sendKeys("Mehul2");
		driver.findElement(By.id("UserCompanyName")).sendKeys("Mehul3");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter User Companyname']/../..//button")).click();
		
		Alert alert = driver.switchTo().alert(); 
		//SwitchTo ? Reason : Alert is not Inspected
		
//		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		//alert.cancel();
		driver.quit();
	}
}
