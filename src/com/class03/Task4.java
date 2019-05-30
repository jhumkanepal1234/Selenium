package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Mercury Tours Registration:
//		Open chrome browser
//		Go to “http://newtours.demoaut.com/”
//		Click on Register Link
//		Fill out all required info
//		Click Submit
//		User successfully registered
//		(Create 2 scripts using different locators)
//      Using RelativeXPath
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bijay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Luitel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9845147351");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("bijay.luitel@outlook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Handi Khola");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Suite 200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Sanantar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Hetuada");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bijay.luitel@outlook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Luitel123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Luitel123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

}
