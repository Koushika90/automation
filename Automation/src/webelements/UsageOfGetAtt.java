package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAtt {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.name("login"));
		
		String Tagname= button.getTagName();
		
		String Tagtext = button.getText();
		
		String Value= button.getAttribute("data-testid");
		
		String color = button.getCssValue("background-color");
		
		System.out.println("tag name of the element:  " +Tagname);
		
		System.out.println("tag text of the element:  " +Tagtext);
		
		System.out.println("value of the element:     " +Value);
		
		System.out.println("color of the element:     " +color);
		
		driver.quit();
	}
}
