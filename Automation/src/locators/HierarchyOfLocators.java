package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HierarchyOfLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("D:/Q SPIDERS/html files/demo.html");
		
		WebElement ele= driver.findElement(By.tagName("a"));
		
		ele.click(); Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement ele1= driver.findElement(By.id("d2"));
		
		ele1.click();Thread.sleep(2000);
		
		//here code has been optimised by fallowing 3rules:
		//1. variables are same i.e. ele1
		//2. assignment operator present
		//3. replace the variable ele1 by RHS i.e.
		//	ele1 by driver.findElement(By.id("d2"))
		//optimised code will be driver.findElement(By.id("d2")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.name("n1")).click();Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.className("c2")).click();Thread.sleep(2000);
		
		/*driver.findElement(By.linkText("Google")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Flip")).click();*/
		
		driver.quit();
		
	}
}
