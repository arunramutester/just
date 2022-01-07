package org.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OctoberBatch {
	
	public static void main(String[] args) {
		// test pull
		//drivers and path
		// new branch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nice day\\eclipse-workspace\\GitProject\\Drivers\\chromedriver.exe");
		
		//launch browser
		
		WebDriver driver = new ChromeDriver();
		
		//pass URL
		
		driver.get("https://www.facebook.com/");
		
		//to find the locators
		
		driver.findElement(By.id("email")).sendKeys("arun");
		
		driver.findElement(By.id("pass")).sendKeys("arun@123");
		
		WebElement userlog = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		userlog.click();
	}

}
