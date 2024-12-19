package assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		driver.get("https://www.google.com/");
	
		driver.findElement(By.name("q")).sendKeys("jobs"+Keys.ENTER);
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
		List<WebElement> allsugs = driver.findElements(By.tagName("a")); 
	
		int count = allsugs.size();
	
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
	
		System.out.println("The count of elemenets is " + count);
	
		for(WebElement ele:allsugs) 
		{
	
		String text = ele.getAttribute("href");
	
		System.out.println(text);
		
		}
		
		driver.quit();
		}
	}