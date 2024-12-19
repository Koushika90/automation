package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://online.actitime.com/ssandeep/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager"+ Keys.ENTER);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	wait.until(ExpectedConditions.urlContains("timetrack"));
	
	// Get the current URL after the wait
	
	String homePageURL = driver.getCurrentUrl();
	
	System.out.println("Home page URL: " + homePageURL);
	
	// Close the browser
	
	driver.quit();
	
	
	}
	
}