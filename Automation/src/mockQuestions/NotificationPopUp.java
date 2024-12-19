package mockQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("--disable notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search/");
		
		driver.quit();
		
	}
	
}
