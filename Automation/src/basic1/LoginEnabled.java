package basic1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		boolean active= driver.findElement(By.linkText("Log in")).isEnabled();
		
		
		if(active) {
			
			System.out.println("login button is enabled");
			
		}
		
		else {
			
			System.out.println("login button is disabled");
		}
		
		driver.quit();
	}
}
