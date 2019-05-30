package com.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		

	}

}
