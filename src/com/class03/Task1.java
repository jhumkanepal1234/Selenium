package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
//	TC 1: Facebook login:
//		Open chrome browser
//		Go to “https://www.facebook.com/”
//		Enter valid username and valid password and click login
//		User successfully logged in

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("woodbridgewoodbridge@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Selenium@420");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		

	}

}
