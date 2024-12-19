package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidPage {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println(actualUrl);
		
		String expectedTitle = "Google";
		
		String expectedURL = "https://www.google.com/";
		
		if(actualtitle.equalsIgnoreCase(expectedTitle)&& actualUrl.equalsIgnoreCase(expectedURL))
		{
			System.out.println("VALID WEBPAGE DISPLAYED");
		}
		
		else
		{
			System.out.println("VALID WEBPAGE NOT DISPLAYED");
		}
		
		driver.quit();
	}
}
