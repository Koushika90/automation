package mouseAcrions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DoubleClick {


public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
	
driver.manage().window().maximize();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));Thread.sleep(2000);
		
driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
WebElement ele = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));Thread.sleep(2000);
		
Actions a = new Actions(driver);Thread.sleep(2000);
		
a.doubleClick(ele).perform();Thread.sleep(2000);
		
WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		
if(text.isDisplayed()) {
		
	System.out.println("Text is displayed");
	
	} 
		
else {

	System.out.println("Text not displayed");
	
	}
		
	driver.quit();
	
	}
}