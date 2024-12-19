package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Apple iPhone");
		
		List<WebElement> allsugs = driver.findElements(By.xpath("//div[contains(text(),'apple')]"));
		
		int count = allsugs.size();
        
		System.out.println("The count of elements is " + count);
        
        for (WebElement ele : allsugs) {
        
        	String text = ele.getText();
            
        	System.out.println(text);
        }

			driver.quit();

	}

}
//whenever elements are not inspectable we can freeze elements by fallowing the below steps.
// go to styles and select hov(toggle elements state) click on element focus page
//click on event listners select blur option and delete all the options under it
//go to sources tab in devolper tools and place the cursor on the element to be inspected
//click "ctrl+/" or on the pause button and go to elements tab
