package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",  driver.findElement(By.id("draggable")));
		
		Actions action = new Actions(driver);
		WebElement dragOne = driver.findElement(By.id("draggable"));
		WebElement dragZone = driver.findElement(By.cssSelector("#simpleDropContainer>#droppable"));
		action.dragAndDrop(dragOne, dragZone).perform();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
