package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-test=username]")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		
	}

}
