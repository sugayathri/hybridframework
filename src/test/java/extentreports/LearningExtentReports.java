package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningExtentReports {

	public static void main(String[] args) {
		// start reporters
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentreports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it   
		ExtentTest test1=extent.createTest("Google search Test one","this is a test to validate google search functionality");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		test1.log(Status.INFO, "information about chrome");
		
		driver.get("https://google.com");
		test1.pass("Navigated to google");
		driver.findElement(By.name("q")).sendKeys("selenium webdriver tuorials");
		test1.pass("searching required subject");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);;
		test1.pass("clicking the info");
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		test1.info("test completed");
		// calling flush writes everything to the log file
        extent.flush();
    
		
		
	}

}
