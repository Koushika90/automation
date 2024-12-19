package mockQuestions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("file:///D:/Q%20SPIDERS/html%20files/city.html");
				
		WebElement ele = driver.findElement(By.id("city"));

		Set<String> ts = new TreeSet<String>();
				
		Select s = new Select(ele);
				
		List<WebElement> city = s.getOptions();
				
		for(int i=0; i<city.size();i++) {
					
			String text= city.get(i).getText();
					
			boolean res=ts.add(text);
					
		if (res==false) {
						
			System.out.println("Duplicate city present:  " +text);
		
			}
		
		}
		
		driver.quit();
	}	

}