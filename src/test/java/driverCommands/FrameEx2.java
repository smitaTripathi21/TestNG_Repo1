package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/nestedframes");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
