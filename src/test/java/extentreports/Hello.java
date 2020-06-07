package extentreports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello {
	
	    public static void main(String[] args) throws Exception {
	        // start reporters
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
	        // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	        WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();

	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");
	        driver.get("https://google.com");
	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
	        
	        // calling flush writes everything to the log file
	        extent.flush();
	    }
	}


