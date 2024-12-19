package mockQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSuggestion {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		List<WebElement> allsugs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		int count = allsugs.size();
		
		System.out.println("Count is   "+count);
		
		System.out.println("-------------------------------");
		
		for (WebElement ele : allsugs) 
		{
			
			String text = ele.getText();
			
			System.out.println("the links listed are:  " +text);
			
		}
		
		driver.quit();
	}
	
}