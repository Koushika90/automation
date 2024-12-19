package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsUsageInWebdriver {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		//opens and store address 
		driver.get("https://www.qspiders.com");
		//trigger url
		driver.manage().window().maximize();
		//maximize window
		driver.navigate().to("https://www.jspiders.com");
		//opens new url
		driver.navigate().back();
		//navigate back to previous url
		Thread.sleep(2000);
		
		driver.navigate().forward();
		//navigate to new url
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		//refreshes the url
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		System.out.println("-----------------------------------------------");
		
		System.out.println(ActualTitle);
		//stores title
		System.out.println("-----------------------------------------------");
		
		String ActualUrl=driver.getCurrentUrl();
		System.out.println("-----------------------------------------------");
		
		System.out.println(ActualUrl);
		//stores url
		System.out.println("-----------------------------------------------");
		
		String ExpectedUrl="https://www.jspiders.com/";
		
		String ExpectedTitle="Java Training Institute | jSpiders";
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)&& ActualUrl.equalsIgnoreCase(ExpectedUrl))
		//compares the object 
			{
				
			System.out.println("-----------------------------------------------");
			
				System.out.println("Pass: Url and Title are same");
				
			System.out.println("-----------------------------------------------");
			
			}

		else
			{
			
			System.out.println("-----------------------------------------------");
			
				System.out.println("Fail: Url and Title are different");
				
			System.out.println("-----------------------------------------------");
			}

		
		driver.manage().window().fullscreen();
		//makes fullscreen
		driver.manage().window().setSize(new Dimension(300,777));
		//fixes the dimension of window
		driver.manage().window().setPosition(new Point(200,777));
		//sets the position
		
		driver.quit();
		//quits the browser
		WebDriver driver1= new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://www.google.com");
		
		System.out.println("----------------------------------------------------------------------------------");
		
		String pgsrc=driver1.getPageSource();
		
		System.out.println("Page Source is  "+pgsrc);
		//gets page source
		System.out.println("----------------------------------------------------------------------------------");
		
		Dimension dimension=driver1.findElement(By.className("lnXdpd")).getSize();
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Search bar height :  "+ dimension.height + "mm");
		
		System.out.println("Search bar width  : "+ dimension.width + "mm");
		
		System.out.println("-----------------------------------------------");
		
		driver1.quit();
				
	}

}