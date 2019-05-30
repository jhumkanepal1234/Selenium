package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	
	public static String userName="Asmit";
	public static String password="Nepal";

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Swag Labs Negative login:
//		Open chrome browser
//		Go to “https://www.saucedemo.com/”
//		Enter invalid username and password and click login
//		Verify error message contains: “Username and password do not match any user in this service”
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[placeholder*='Username']")).sendKeys(userName);
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[type*= 'password']")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[starts-with(@class, 'btn_ac')]")).click();
		
		WebElement errorMessage = driver.findElement(By.cssSelector("svg[data-icon*='times-circle']"));
		String valueerrorMessage= errorMessage.getText();
		
		if(valueerrorMessage.contains("User name and pass")) {
			System.out.println(userName + "is unable to log in, Test passed");
		}else{
			System.out.println(userName+" is loged in, Test failed");
		}
		driver.quit();

	}

}
