package com.classPractice;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Iframe extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']" )));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Asmit");
		driver.switchTo().defaultContent();
		
		Boolean Switch = driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		if(Switch==true) {
			driver.close();
		}
		
		
	
		

	}

}
