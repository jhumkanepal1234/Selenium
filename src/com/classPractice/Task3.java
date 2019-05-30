package com.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Swag Labs Positive login:
//		Open chrome browser
//		Go to “https://www.saucedemo.com/”
//		Enter valid username and valid password and click login
//		Verify robot icon is displayed
//		Verify “Products” text is available next to the robot icon
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[placeholder*='Username']")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[type*= 'password']")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[starts-with(@class, 'btn_ac')]")).click();
		
		boolean logo=driver.findElement(By.cssSelector("div[class*='peek']")).isDisplayed();
		if (logo) {
			System.out.println("Robert is displayed");
		}else{
			System.out.println("Robert is not displayed");
		}
		WebElement product = driver.findElement(By.cssSelector("div[class*='product_label']"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="products";
		if (displayP  && productText.equalsIgnoreCase(expectedText)) {
			System.out.println("Element is displayed and text is "+productText);
		}else {
			System.out.println("Element is Not dispalyed or text is not="+productText);
		}
		
		
		driver.quit();
		
		
		
	}

}






