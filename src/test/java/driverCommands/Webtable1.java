package driverCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table = driver.findElement(By.id("countries"));
		
		
		List<WebElement> rows = driver.findElements(By.cssSelector("#countries tbody tr"));
		System.out.println("Total Rows : " + rows.size());
		for(int i=1;i<rows.size();i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			for(int j=1;j<cols.size();j++) {
				WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println("Table data in row " + i + " " + data.getText());
			}
			System.out.println();
			
		}
		
		
		
		
		/*
		List<WebElement> rows = driver.findElements(By.cssSelector("#countries tbody tr"));
		List<WebElement> cols = driver.findElements(By.cssSelector("#countries tbody tr td"));
		System.out.println("Total Rows : " + rows.size());
		
		
		for(int i =0;i<rows.size();i++) {
			WebElement row = rows.get(i);
			WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+(i+1)+"]/td"));
			System.out.println("table Data in row " + i + " " + data.getText());
			//System.out.println(row.getText());
		}
		
		*/
		
		driver.quit();
		
		
		
		
		
	}
}
