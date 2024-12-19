package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {

	public static void main(String[] args) {
		
		/*WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		driver.findElement(By.name("login")).submit();
		
		driver.quit();*/
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://www.instagram.com/");
		
		//here submit() does'nt work since in insta there is no submit as tagtext.
		
		driver1.findElement(By.linkText("Sign up")).click();
		
		driver1.quit();
	}
}
