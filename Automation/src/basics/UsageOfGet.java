package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Dimension d=driver.findElement(By.className("gLFyf")).getSize();
		
		System.out.println("Search bar height: "+ d.height +" mm" );
		
		System.out.println("Search bar width:  "+ d.width +" mm");
		
		
		//@SuppressWarnings("unused")
		//Point getPosition= new Point(0, 0);
		
		//System.out.println(getPosition);

		driver.quit();
	}

}
