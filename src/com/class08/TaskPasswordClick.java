package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskPasswordClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome","https://www.saucedemo.com" );
		WebElement passClick= driver.findElement(By.xpath("//input[@data-test='password']"));
		Actions action = new Actions(driver);
		action.contextClick(passClick).perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}
