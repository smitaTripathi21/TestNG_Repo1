package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Dimension dim = driver.manage().window().getSize();
		System.out.println("Height " + dim.getHeight());
		System.out.println("Width " + dim.getWidth());
		
		driver.manage().window().setSize(new Dimension(1024 , 768));
		
		Dimension dim2 = driver.manage().window().getSize();
		System.out.println("Height1 " + dim2.getHeight());
		System.out.println("Width1 " + dim2.getWidth());
		
		driver.quit();
		
	}
}
