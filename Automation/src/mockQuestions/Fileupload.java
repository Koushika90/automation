package mockQuestions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		File f = new File("./docs./assignments selenium.pdf");
		
		String abspath= f.getAbsolutePath();
		
		System.out.println(abspath);
		
		driver.findElement(By.id("fileInput")).sendKeys(abspath);
		
		
	}
}