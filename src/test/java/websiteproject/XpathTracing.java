package websiteproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTracing {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement hindi=driver.findElement(By.xpath("//a[@href='https://hi-in.facebook.com/']"));
	Thread.sleep(3000);
		hindi.click();  
		WebElement urdu=driver.findElement(By.xpath("//a[@href='https://ur-pk.facebook.com/']"));
		urdu.click();
		WebElement signup=driver.findElement(By.xpath("//a[@href='/r.php']"));
		Thread.sleep(3000);
		signup.click();
		WebElement English=driver.findElement(By.xpath("//a[@href='https://en-gb.facebook.com/r.php']"));
		English.click();
		WebElement Adchoices=driver.findElement(By.xpath("//a[@class='_41ug']"));
		Adchoices.click();
		WebElement UsingFacebook=driver.findElement(By.xpath("//div[@id='u_0_1']"));
		UsingFacebook.click();
		WebElement Events=driver.findElement(By.xpath("//a[@id='u_0_b']"));
		Events.click();
	
	//	driver.close();
		
	}

}
