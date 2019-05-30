package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		2: Verify element is clickable
//		1. Open chrome browser
//		2. Go to “https://the-internet.herokuapp.com/”
//		3. Click on “Click on the “Dynamic Controls” link
//		4. Select checkbox and click Remove
//		5. Click on Add button and verify “It's back!” text is displayed 6. Close the browser
		
		String url="https://the-internet.herokuapp.com/";
		
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.cssSelector("input[type*='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WebElement element = driver.findElement(By.cssSelector("p[id='message']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		if(element.isDisplayed()) {
			String text = element.getText();
			System.out.println(text+" is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
