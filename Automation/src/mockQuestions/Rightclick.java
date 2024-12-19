package mockQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele=	driver.findElement(By.linkText("Create new account"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(ele).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		
		driver.quit();
		
	}
}