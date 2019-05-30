package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
//	TC 2: Mercury Tours Registration:
//		Open chrome browser
//		Go to “http://newtours.demoaut.com/”
//		Click on Register Link
//		Fill out all required info
//		Click Submit
//		User successfully registered
//		(Create 2 scripts using different locators)

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Muhammad");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Ali");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("1234567899");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("asmitnepal@yahoo.com.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("123 Ali Drive");
		Thread.sleep(1000);
		driver.findElement(By.name("address2")).sendKeys("Suite 201");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Sterling");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("Virginia");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("asmitnepal@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
