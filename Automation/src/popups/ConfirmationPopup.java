package popups;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.linkText("Alert with OK & Cancel")).click(); Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss();Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.id("demo"));
	
	System.out.println("THE TEXT APPEARED IS: "+ele.getText());
	
	driver.navigate().back();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.linkText("Alert with Textbox")).click();Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();Thread.sleep(2000);
	
	driver.switchTo().alert().sendKeys("SUDEEP");Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	WebElement ele1 = driver.findElement(By.id("demo1"));
	
	System.out.println("THE TEXT APPEARED IS: " +ele1.getText());
	
	driver.quit();

	}
}