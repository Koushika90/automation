package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddandDeleteProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost/login.do"); Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin"); Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager"); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click(); Thread.sleep(2000);
		
		driver.findElement(By.linkText("TASKS")).click(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click(); Thread.sleep(2000);
		
		driver.findElement(By.className("createNewProject")).click(); Thread.sleep(2000);
		
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Selenium");
		
		driver.findElement(By.id("projectPopup_customerSelectorPlaceholder")).click();
		
		driver.findElement(By.linkText("Our Company")).click(); Thread.sleep(2000);
		
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Learning");
		
		driver.findElement(By.id("projectPopup_commitBtn")).click(); Thread.sleep(2000);
		
		driver.findElement(By.id("logoutLink")).click(); Thread.sleep(2000);	
		
		driver.get("http://localhost/login.do"); Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin"); Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager"); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click(); Thread.sleep(2000);
		
		driver.findElement(By.linkText("TASKS")).click(); Thread.sleep(2000); Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
		
		search.sendKeys("Selenium");
		
		search.click();
		
		driver.findElement(By.xpath("//span[@class='highlightToken']/../..//div[@class='editButton available']")).click(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='actionButton'])[1]")).click(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='actions'])[1]")).click(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click(); Thread.sleep(2000);
		
		driver.findElement(By.id("customerPanel_deleteConfirm_submitBtn")).click(); Thread.sleep(2000);
		
		driver.findElement(By.id("logoutLink")).click(); Thread.sleep(2000);
	}
	
}
