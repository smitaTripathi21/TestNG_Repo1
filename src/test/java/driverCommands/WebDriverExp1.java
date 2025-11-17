package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverExp1 {
	public static void main(String[] args) throws InterruptedException {
		//Path Set
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
//		
//		//WebDriver driver = new ChromeDriver(); // Only this line opens --> Browser 
//		WebDriver driver = new EdgeDriver(); 
//		driver.get("https://www.google.com");
		
		
		//WebDriver driver = new WebDriver(); // Error : Because WebDriver is Interface
		
		
		WebDriverManager.chromiumdriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		
//		//WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		option.addArguments("--incognito");
		//option.addArguments("--start-maximized");
		//option.addArguments("--disable-popup-blocking");
		//option.addArguments("--start maximized");
		WebDriver driver = new ChromeDriver(option);
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize(); // option we can also use
//		//driver.manage().window().minimize();
//		driver.close(); //Only current 1 opened tab
		
		
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize(); // Load as Whole --> Then maximize
		System.out.println("After clicking on back button : Title " + driver.getTitle());
		driver.get("https://www.google.com");
//		JavascriptExecutor js = (JavascriptExecutor) driver ;
//		js.executeScript("arguments[0].click();", driver.findElement(By.id("tabButton")));
		Thread.sleep(2000); // checks the System and close it or goes in sleep as if pause
		driver.navigate().back();
		System.out.println("After clicking on back button : Title " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("After clicking on back button : Title " + driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
//		System.out.println("Source " + driver.getPageSource());
//		System.out.println("URl " + driver.getCurrentUrl());
//		System.out.println("Title " + driver.getTitle());
		driver.quit() ;  // close all the tab Opened
		
	}
	
}
