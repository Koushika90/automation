package webelements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlInGoogle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Sudeep"+Keys.ENTER);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		List<WebElement> allsugs = driver.findElements(By.tagName("a"));
		
		int count = allsugs.size();
		
		System.out.println("The count of elemenets is " + count);
		
		for(WebElement ele:allsugs) {
			
			String text = ele.getAttribute("href");
			
			System.out.println(text);
		}
		
		driver.quit();

	}
}
