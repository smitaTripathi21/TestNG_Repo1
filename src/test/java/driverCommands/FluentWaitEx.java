package driverCommands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver , WebElement>(){
			//Apply got override 
			public WebElement apply(WebDriver driver) {
				WebElement el = driver.findElement(By.id("registration2"));
				if(el.isDisplayed()) {
					return el;
				}
				else {
					return null;
				}
			}
		});
		
		element.click();
		driver.quit();
		
		
	}
}
