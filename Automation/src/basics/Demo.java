package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();//launches the google chrome app 
										//and and stores the address in driver variable
	
	driver.get("https://google.co.in");//helps to trigger the chrome app url
	
	String title = driver.getTitle();//stores the title of the of current website
	
	System.out.println(title);

	driver.close();//close the chrome window
	
	
	}

}
