package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
/*
 * Report --> Executed in type of HTML
 */
public class ExtentReportExp1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
		reporter.config().setReportName("Automation test Report");
		reporter.config().setDocumentTitle("Test Execution Report");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("tester", "hemakStl");
		report.setSystemInfo("Env","QA");
		report.setSystemInfo("Browser", "Chrome");
		
		
		ExtentTest test = report.createTest("Login Test" , "verify login Func");
		
		WebElement registration = driver.findElement(By.id("registration2"));
		registration.click();
		test.log(Status.PASS, "Registration link clicked");
		driver.findElement(By.id("unameSignin")).sendKeys("Hemak");
		test.log(Status.PASS, "Username entered");
		driver.quit();
		report.flush();
		
		
	}
}
