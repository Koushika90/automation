package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage {

public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();

		// triggers the chrome browser and stores the address in driver variable
		
		driver.get("https://www.google.com");

		//gets the url of app
		
		String ActualTitle=driver.getTitle();
		
		//stores the title in variable
		
		//System.out.println(ActualTitle);
	
		String ActualUrl=driver.getCurrentUrl();
		
		//stores the current url in variable
		
		//System.out.println(ActualUrl);
		
		String ExpectedUrl="https://www.google.com/";
		
		String ExpectedTitle="Google";
		
		/*if((ActualTitle==ExpectedTitle) && ActualUrl==ExpectedUrl)this will compare the address of the object but not the title name
		{
			System.out.println("Pass: URL and Title are same");
			
		}
		
		else
		{
			System.out.println("Fail: URL and Title are different");
		}*/
		
		
		/*if((ActualTitle.equals(ExpectedTitle)) && ActualUrl.equals(ExpectedUrl))
		{
			System.out.println("Pass: URL and Title are same");
			
		}
		
		else
		{
			System.out.println("Fail: URL and Title are different");
		}*/
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle) && ActualUrl.equalsIgnoreCase(ExpectedUrl))
			
//here equals ignorecase method will check for title and also url ignoring case sensitvity
			
		{
			System.out.println("Pass: URL and Title are same");
			
		}
		
		else
		{
			System.out.println("Fail: URL and Title are different");
		}
		
		driver.close();
		
	}
}
