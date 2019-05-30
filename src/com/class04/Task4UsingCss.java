package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4UsingCss {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Mercury Tours Registration:
//			Open chrome browser
//			Go to “http://newtours.demoaut.com/”
//			Click on Register Link
//			Fill out all required info
//			Click Submit
//			User successfully registered
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name^='email'")).sendKeys("test123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type$='word'")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name*='firm'")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name^='regis'")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
