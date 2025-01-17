package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("");
	
	WebElement dropdownElement = driver.findElement(By.id("state"));
	
	Select stateDropdown = new Select(dropdownElement);
	
	List<String> states = new ArrayList<>();
	
	for(WebElement option :stateDropdown.getOptions()) {
	
		states.add(option.getText());
	}
	
	Collections.sort(states);
	
	for(String state:states) {
	
		System.out.println(state);
}

	driver.quit();
}

}
	