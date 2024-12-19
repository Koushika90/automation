package popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
		
		driver.findElement(By.xpath("//section[contains(text(),'Popups')]")).click();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[contains(text(),'File Uploads')]")).click();Thread.sleep(2000);
		
		File f = new File("./Docs/assignments selenium.pdf");Thread.sleep(2000);
		
		String abspath = f.getAbsolutePath();
		
		System.out.println(abspath);
		
		driver.findElement(By.id("fileInput")).sendKeys(abspath);
				
	}
}