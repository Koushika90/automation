package assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected
{
	
	public static void main(String[] args) 
	
	{
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.linkText("Create new account")).click();
	
		WebElement maleradio = driver.findElement(By.xpath("//label[text()='Male']/..//input"));
	
		maleradio.click();
	
		if (maleradio.isSelected()) {
	
		System.out.println("Male radio button is selected.");
		} 
	
		else {
		System.out.println("Male radio button is NOT selected.");
		}
	
		driver.quit();
	
		}
	
	}