package mockQuestions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllCities {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Q%20SPIDERS/html%20files/city.html");
		
		WebElement ele = driver.findElement(By.id("city"));
		
		Select city = new Select(ele);
		
		List<WebElement> allcity = city.getOptions();
		
		for (WebElement cities : allcity)
		{

			String text= cities.getText();
			
			System.out.println(text);
		}
		
		driver.quit();
	}
}