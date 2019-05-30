package com.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
//		Open chrome browser
//		Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//		Verify
//		alert box with text “I am an alert box!” is present
//		confirm box with text “Press a button!” is present
//		prompt box with text “Please enter your name” is present
//		Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        
	}

}
