package driverCommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowEXp1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/browser-windows");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mainWindow = driver.getWindowHandle(); // Method --> return window ID (in form of --> Set on Duplication)
		WebElement newTab = driver.findElement(By.cssSelector("#tabButton"));
		js.executeScript("arguments[0].scrollIntoView();", newTab);
		newTab.click();
		Set<String> allWindows = driver.getWindowHandles(); // Get all the Window ID that are opened --> return Set<String>
		System.out.println("Window Title :" + driver.getTitle());
		
		for(String window:allWindows) {
			if(!mainWindow.equals(window)) {
				driver.switchTo().window(window);
				System.out.println("Window-Url :" + driver.getCurrentUrl());
			}
		}
		
		driver.quit();
		
		
		
	}
}
