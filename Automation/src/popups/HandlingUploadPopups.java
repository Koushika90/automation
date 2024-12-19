package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadPopups {

public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("D:\\Q SPIDERS\\html files\\demo1.html");
	
	driver.findElement(By.id("upload button")).sendKeys("C:\\Users\\Dell\\OneDrive\\Desktop\\unused\\final manual notes.pdf");Thread.sleep(5000);
	
	driver.quit();
	
	}
}