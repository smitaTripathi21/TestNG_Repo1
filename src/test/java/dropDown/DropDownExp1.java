package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExp1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("basicelements")).click();
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"indexBody\"]/section/div[5]/div/section[2]/div/form/div[3]/div/select[2]"));
		Select sel = new Select(drop);
		
		
		/*
		 * 
		 * To Check multiple  select : .isMutliple()
		 * 
		sel.selectByVisibleText("1");
		sel.selectByVisibleText("2");
		sel.selectByVisibleText("3");
		sel.selectByVisibleText("4");
		sel.selectByVisibleText("5");
		*/
		
		
		
		/*
		 * 
		 * sel.selectByIndex(2);
		sel.selectByVisibleText("5");
		//sel.deselectByValue("2");
		*/
		
		/*
		 * CheckBox : is selected or not ? --> .isSelected()
		 */
		
	}
}
