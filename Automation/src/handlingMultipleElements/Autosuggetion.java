package handlingMultipleElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://www.google.com/");
		
	// this statement will find the search bar and enters the word"java".
		
	driver.findElement(By.name("q")).sendKeys("java");Thread.sleep(2000);
		
	// this statement will find the word "java" and finds the auto suggestions
	//and also stores the address in allsug which is of list<Webelement> type
		
	List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));Thread.sleep(2000);
		
	// counts the number of auto suggestion present
		
	int count = allsug.size();
		
	System.out.println("count:  " +count);
		
	// accessing all the suggestion shown on screen
		
	for (WebElement ele : allsug)
	
	{
		String text = ele.getText();
			
		System.out.println(text);
	
	}
		
	// clicks on the last suggestion shown 
		
	allsug.get(count-1).click();Thread.sleep(2000);
		
	driver.quit();
	
	}
}

//Note: the comments made above are for the statements below the comment.