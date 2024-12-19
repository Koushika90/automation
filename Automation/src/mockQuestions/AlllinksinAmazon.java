package mockQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksinAmazon {
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.Amazon.in/");
		
		List<WebElement> allEle = driver.findElements(By.tagName("a"));		

		int count = allEle.size();
		
		System.out.println("Count is:" +count);
		
		for(int i=0;i<count;i++) {
			
			WebElement ele = allEle.get(i);
			
			String text= ele.getText();
			
			System.out.println(text);
			
		}
		
		driver.quit();
		
	}
}	