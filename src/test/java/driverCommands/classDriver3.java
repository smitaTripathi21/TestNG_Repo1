package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classDriver3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

		WebElement element_button = driver.findElement(By.xpath("//div[@class='card-body']"));
		JavascriptExecutor js = (JavascriptExecutor)driver  ;
		js.executeScript("arguments[0].click()", element_button) ;
		Thread.sleep(2000);
		
		
		WebElement textBox_button = driver.findElement(By.id("item-0"));
		textBox_button.click();
		
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullName.sendKeys("Mehul");
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		Email.sendKeys("Mehul@gmail.com");
		
		WebElement currAdd = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		currAdd.sendKeys("dfwtygvuhbirjtdhgfy 56283790");
		
		WebElement permAdd = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		permAdd.sendKeys("tfuygvhbkdgn 32457689");
		Thread.sleep(5000);
		
		driver.findElement(By.id("submit")).click();
		
		
		
		WebElement name = driver.findElement(By.id("name"));
		if(fullName.equals(name.getText())) {
			System.out.println("Right name");
		}
		else {
			System.out.println("Wrong name");
		}
		
		/*
		
		WebElement email = driver.findElement(By.id("userEmail"));
		if(Email.equals(email.getText())) {
			System.out.println("Right name");
		}
		else {
			System.out.println("Wrong name");
		}
		
		
		WebElement curAdd = driver.findElement(By.id("currentAddress"));
		if(currAdd.equals(curAdd.getText())) {
			System.out.println("Right name");
		}
		else {
			System.out.println("Wrong name");
		}
		
		
		WebElement perAdd = driver.findElement(By.id("permanentAddress"));
		if(permAdd.equals(perAdd.getText())) {
			System.out.println("Right name");
		}
		else {
			System.out.println("Wrong name");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement textbox_button = driver.findElement(By.xpath("//div[@class='btn btn-light']"));
//		textbox_button.click();
	}
}
