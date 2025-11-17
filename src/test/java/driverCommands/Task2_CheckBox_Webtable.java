package driverCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CheckBox_Webtable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table = driver.findElement(By.id("countries"));
		
		/*
		
		int C = 0;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
		    WebElement cols = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[4]"));
		    if (cols.getText().equals("Euro")) {
		        WebElement checkBox = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[1]//input"));
		        checkBox.click(); // select checkbox
		        C++;
		    }
		}
		*/
		
		//td[text()='Euro']//preceding-sibling::td/input
		int C = 0;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {
		    WebElement euroCell = rows.get(i).findElement(By.xpath(".//td[text()='Euro']"));
		    if (euroCell != null) {
		        WebElement input = rows.get(i).findElement(By.xpath(".//td[text()='Euro']//preceding-sibling::td/input"));
		        input.click();
		        C++;
		    }
		}

		System.out.println("Total Euro rows: " + C);
		driver.quit();

		
	}
}
