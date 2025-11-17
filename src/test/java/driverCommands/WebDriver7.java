package driverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allElements = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:allElements) {
			System.out.println(ele.getAttribute("innerText")+ ele.getAttribute("href"));
		}
		
		
	}
}
