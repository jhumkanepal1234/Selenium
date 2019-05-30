package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys("woodbridgewoodbridge@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@type, 'pass')]")).sendKeys("Selenium@420");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value, 'Log In')]")).click();
		driver.close();
		
		
		

	}

}
