package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate To http
 * Click on edit icon in action columnn where Dept is compilanace and change salary to 25000 add a new Row By clicking on add 
 * Button and provide info
 * Then verify total No. of rows in the Webtable . It should be 4
 */
public class Task3_Action {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.className("rt-table")));

		WebElement edit_Button = driver.findElement(By.xpath("//div[@class='rt-tr-group']//div[text()='Compliance']/ancestor::div[@class='rt-tr-group']//span[@title='Edit']"));
		edit_Button.click();
		
		WebElement salary_input = driver.findElement(By.id("salary"));
		salary_input.clear();
		salary_input.sendKeys("25000");

		driver.findElement(By.id("submit")).click();

		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Demak");
		driver.findElement(By.id("userEmail")).sendKeys("ftjgykhj@gmail.com");
		driver.findElement(By.id("age")).sendKeys("26");
		driver.findElement(By.id("salary")).sendKeys("300");
		driver.findElement(By.id("department")).sendKeys("Finance");
		driver.findElement(By.id("submit")).click();
		
		
		Thread.sleep(5000);
		Dimension NoOfRows = driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']//div[text()!='null']")).getSize();
		int val = NoOfRows.getHeight()/7;
		System.out.println(val);
		driver.quit();
		
		
		
		
		
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("rt-tr-group")));
		//WebElement edit_Button = driver.findElement(By.xpath("//div[@class='rt-tr-group']//div[text()='Compliance']//following-sibling::div/div/span[@id='edit-record-2']/child::node()"));
		WebElement edit_Button = driver.findElement(By.xpath("//div[@class='rt-tbody']/div[@class='rt-tr-group']/div[@role='row']//div[text()='Compliance']//following-sibling::div/div/span[@id='edit-record-2']/child::node()"));
		edit_Button.click();
		
		WebElement salary_input = driver.findElement(By.id("salary"));
		salary_input.clear();
		salary_input.sendKeys("25000");
		//WebElement submit_button = driver.findElement(By.id(""));
		
		
		Thread.sleep(2000);
		driver.quit();
		
		

		// Verify total rows
		int totalRows = driver.findElements(By.cssSelector(".rt-tbody .rt-tr-group")).size();
		System.out.println("Total rows: " + totalRows);

		
		*/
		
	}
}
