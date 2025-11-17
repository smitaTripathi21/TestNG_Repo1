package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("basicelements")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("javascriptPromp")));
		//For Scroll : Window.scroll(0,600);
		js.executeScript("window.scroll(0,600);");
		Thread.sleep(5000);
		driver.findElement(By.id("javascriptPromp")).click();
		
		
		Alert alert =  driver.switchTo().alert(); 
		alert.sendKeys("Mehul");
		alert.accept();
		
		Thread.sleep(3000);
		String val = alert.getText();
		
		driver.findElement(By.id("pgraphdemo")).sendKeys("Hello " + val + " How are you doing?");
		
	}
}
