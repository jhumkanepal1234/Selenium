package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/asmitnepal/Selenium/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		
		
}
}
