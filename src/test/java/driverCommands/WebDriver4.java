package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver4 {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		
		
		//Explicit Wait Example :
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("(//section[@class='I1dVQ']//descendant::div[starts-with(@class,'C')])[1]")
		));
		
		// Ended here Example
		
		String title = titleElement.getText();
		System.out.println(title);

		driver.quit();
	}
}
