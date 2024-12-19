package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSel {

public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("D:\\Q SPIDERS\\html files");
	 	
	driver.findElement(By.cssSelector("a[id='d1']")).click();
		
	Thread.sleep(2000);
		
	driver.navigate().back();
		
	driver.findElement(By.cssSelector("a[name='n2']")).click();
		
	Thread.sleep(2000);
		
	driver.navigate().back();
		
	driver.findElement(By.cssSelector("a[class='c1']")).click();
		
	Thread.sleep(2000);

	driver.navigate().back();
		
	//driver.findElement(By.cssSelector("a[class='c2']")).click();
		
	WebElement ele= driver.findElement(By.cssSelector("a[href='https://www.flipkart.com/']"));
		
	ele.click();
		
	driver.quit();
		
	}
	
}