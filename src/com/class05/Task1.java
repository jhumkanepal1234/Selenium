package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
//	TC 1: Swag Labs Positive login:
//		Open chrome browser
//		Go to “https://www.saucedemo.com/”
//		Enter valid username and valid password and click login
//		Verify robot icon is displayed
//		Verify “Products” text is available next to the robot icon

	public static String userName = "standard_user";
	public static String password = "input#password";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.saucedemo.com/");
		WebElement userNameTxt = driver.findElement(By.cssSelector("input[class^='form_input']"));
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(2000);
		boolean isDisplayed = driver.findElement(By.cssSelector("div[class*='pee']")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Robert icon is displayed");
		} else {
			System.out.println("Robert icon is NOT displayed");
		}
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.cssSelector("div[class*='product_label']"));
		String value = product.getText();
		
		if (value.equalsIgnoreCase("products")) {
			System.out.println(userName + " is logged in. Test case PASS");
		} else {
			System.out.println(userName + " is NOT logged in. Test case FAIL");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
