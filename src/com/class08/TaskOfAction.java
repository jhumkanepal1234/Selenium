package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskOfAction extends CommonMethods {
//  Navigate to https://www.toolsqa.com
//  Hover over the Tutorial menu
//  Click on Software Testing Tutorial
//  Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action =  new Actions (driver);
		action.moveToElement(ele).click().perform();
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		Thread.sleep(2000);
		driver.close();
	
		
		

	
}
}

