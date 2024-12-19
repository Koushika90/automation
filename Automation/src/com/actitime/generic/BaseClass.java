package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() throws InterruptedException 
	{
	
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("http://localhost/login.do");Thread.sleep(2000);
	
		Reporter.log("openBrowser", true);
		
	}
	
	@BeforeMethod
	
	public void login() throws InterruptedException {
	
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		Reporter.log("login", true);
	}
	
	@AfterMethod
	
	public void logout() {
	
		driver.findElement(By.id("logoutLink")).click();
	
		Reporter.log("logout", true);
	}
	
	@AfterTest
	
	public void closeBrowser() {
	
		driver.manage().window().minimize();
	
		driver.quit();

		Reporter.log("closeBrowser", true);
	
	}

}