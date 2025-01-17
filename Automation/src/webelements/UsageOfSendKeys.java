package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("virat@18");
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"A");Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"C");Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
	}
}
