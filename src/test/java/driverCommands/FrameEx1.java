package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("iframes")).click();
		//driver.switchTo().frame("site1");
		
		driver.switchTo().frame(driver.findElement(By.name("site1")));
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		
		Thread.sleep(10000);
		driver.switchTo().defaultContent(); //return to main Frame --> Launched by driver.get()
		//driver.switchTo().parentFrame(): // if parent Frame Exists goes to parent 
		driver.findElement(By.id("iframes")).click();
		
	}
}
