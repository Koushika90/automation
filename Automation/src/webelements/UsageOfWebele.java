package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWebele {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("login")).click();Thread.sleep(2000);		
		
		WebElement wmsg = driver.findElement(By.xpath("//input[@id='email']/../div[2]"));
		
		String Color = wmsg.getCssValue("color");
		
		System.out.println("color of warning msg:  " +Color);
		
		String Text = wmsg.getText();
		
		System.out.println("tag text is:  " +Text);
		
		WebElement Fpwd = driver.findElement(By.linkText("Forgotten password?"));
		
		String url = Fpwd.getAttribute("href");
		
		System.out.println(url);
				
		driver.quit();
	}
}