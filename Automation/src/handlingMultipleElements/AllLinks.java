package handlingMultipleElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Q%20SPIDERS/html%20files/demo.html");
		
		List<WebElement> allele = driver.findElements(By.tagName("a"));
		
		int count = allele.size();
		
		System.out.println(count);
		
		WebElement ele= allele.get(0);
		
		String Text = ele.getText();
		
		System.out.println(Text);
		
		WebElement ele1= allele.get(1);
		
		String Text1 = ele1.getText();
		
		System.out.println(Text1);
		
		driver.quit();
	}
	
}
