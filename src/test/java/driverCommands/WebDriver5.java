package driverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
//		List<WebElement> allLinks = driver.findElements(By.tagName("img"));
//		System.out.println(allLinks.size());
		
		
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class=\"card-body\"]/h5"));
		for(WebElement ele:allElements) {
			System.out.println(ele.getText());
		}
		driver.close();
		
		
	}

}