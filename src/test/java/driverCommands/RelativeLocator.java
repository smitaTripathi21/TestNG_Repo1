package driverCommands;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelativeLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("registration2")).click();
		driver.manage().window().maximize();
		
		//WebElement ele = driver.findElement(By.id("fullName"));
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
		WebElement ele = driver.findElement(By.id("fullName"));

		WebElement abovEl = driver.findElement(with(By.tagName("p")).above(ele));
		WebElement belowEl = driver.findElement(with(By.tagName("input")).below(ele));
		WebElement leftEl = driver.findElement(with(By.tagName("input")).toLeftOf(belowEl));
		//WebElement rightEl = driver.findElement(with(By.tagName("input")).toRightOf(ele));
		WebElement nearEl = driver.findElement(with(By.tagName("input")).near(ele));
		
		
		System.out.println("Above element: " + abovEl.getText());
		System.out.println("Below element: " + belowEl.getAttribute("placeholder"));
		System.out.println("Left element: " + leftEl.getAttribute("placeholder"));
		//System.out.println("Right element: " + rightEl.getAttribute("placeholder"));
		System.out.println("Near element: " + nearEl.getAttribute("placeholder"));

	}
}