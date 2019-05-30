package com.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class WaitsAndText extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
//		Verify element is enabled
//		1. Open chrome browser
//		2. Go to “https://the-internet.herokuapp.com/”
//		3. Click on “Click on the “Dynamic Controls” link
//		4. Click on enable button
//		5. Enter “Hello” and verify text is entered successfully 6. Close the browser
		
		String url="https://the-internet.herokuapp.com/";
		
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
//		String textToEnter="Hello";
		element.sendKeys("Hello");
		
		String value=element.getAttribute("value");
		System.out.println(value);
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
