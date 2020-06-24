package testngPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitpgm {
	public WebDriver driver;
	@Before
	public void launchapp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

@After
public void closeapp()
{
	driver.close();
}
@Test
public void test1()
{
	driver.findElement(By.id("email")).sendKeys("ioplko");
	boolean a=driver.findElement(By.id("pass")).isDisplayed();
	Assert.assertEquals(true,a);
	Assert.assertEquals(true,driver.findElement(By.id("pass")).isEnabled());
	System.out.println(driver.getTitle());
	
}
@Test
public void test2()
{
	driver.findElement(By.id("email")).sendKeys("guijkwio");
	boolean a=driver.findElement(By.id("pass")).isDisplayed();
	Assert.assertEquals(true,a);
	Assert.assertEquals(true, driver.findElement(By.id("pass")).isEnabled());
	System.out.println(driver.getTitle());
}
}
