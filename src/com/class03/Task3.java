package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Facebook login:
////			Open chrome browser
////			Go to “https://www.facebook.com/”
////			Enter valid username and valid password and click login
////			User successfully logged in
//			
//			Using Relative Xpath
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("woodbridgewoodbridge@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Selenium@420");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@controls='typeahead_list_u_5_1]")).click();
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@class='_1frb']")).sendKeys("Pokhrel Rajat");
////		Thread.sleep(3000);
////		driver.navigate().refresh();
		
		
		
		


	}

}