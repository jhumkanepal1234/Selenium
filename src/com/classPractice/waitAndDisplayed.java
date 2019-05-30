package com.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class waitAndDisplayed extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//	 TC 1: Verify element is present
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Loading” link
//		Click on “Example 1...” and click on “Start”
//		Verify element with text “Hello World!” is displayed
//		Close the browser
		
		String url="https://the-internet.herokuapp.com/";
		
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(ele.isDisplayed()) {
			String txt = ele.getText();
			System.out.println(txt+" is dipsplayed ");
		}else {
			System.out.println("Element is not displayed");
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
	}

}
