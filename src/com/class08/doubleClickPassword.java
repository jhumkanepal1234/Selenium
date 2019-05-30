package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClickPassword extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		setUpDriver("firefox", "https://www.saucedemo.com");
//		driver.findElement((By.xpath("//input[@data-test='password']"))).sendKeys("AAAAA");
//		Actions action = new Actions(driver);
//		action.doubleClick(driver.findElement(By.xpath("//input[@data-test='password']"))).perform();
//		Thread.sleep(2000);
//		driver.close();
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Nepal");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//input[@placeholder='Password']"))).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}

