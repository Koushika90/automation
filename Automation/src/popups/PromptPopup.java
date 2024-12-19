package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.linkText("Alert with Textbox")).click();Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();Thread.sleep(2000);
	
	driver.switchTo().alert().sendKeys("Sudeep");Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	WebElement ele = driver.findElement(By.id("demo1"));
	
	System.out.println(ele.getText());
	
	driver.quit();
	
		}
}
