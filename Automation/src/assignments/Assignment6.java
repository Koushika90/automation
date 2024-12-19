package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.yatra.com/");

		// Find and fill the departure city

		WebElement departFrom = driver.findElement(By.className("MuiTypography-root MuiTypography-body1  css-17kn1z8"));

		departFrom.click();

		WebElement departInput = driver.findElement(By.className("MuiTypography-root MuiTypography-body1  css-17kn1z8\""));
	 
		departInput.sendKeys("NEW DELHI");

		// Find and fill the destination city

		WebElement goingTo = driver.findElement(By.className("MuiTypography-root MuiTypography-body1  css-17kn1z8"));

		goingTo.click();

		WebElement goingInput = driver.findElement(By.className("MuiTypography-root MuiTypography-body1  css-17kn1z8"));
	 
		goingInput.sendKeys("MUMBAI");

		Thread.sleep(2000);

		System.out.println("Execution Succesfull");
		
		driver.quit();
		
	}
	
}
