package driverCommands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.time.Duration;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class ScreenShotPage {
 
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		TakesScreenshot sc  = (TakesScreenshot)driver;
		File file = sc.getScreenshotAs(OutputType.FILE);
		Path dest = Paths.get("C://Users//smitripa//Pictures//Pic//demo.png");
		Files.move(file.toPath(), dest);
		driver.close();
	}
}