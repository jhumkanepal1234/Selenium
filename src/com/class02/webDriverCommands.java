package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google");
//		System.out.println(driver.getTitle());
//		String title = driver.getTitle();
//		
//		if(title.equalsIgnoreCase("Google")) {
//			System.out.println("this is the right title");
//		}
//		else {
//			System.out.println("sorry this is not the title");
//		}
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title1= driver.getTitle();
		
		if(title1.equalsIgnoreCase("facebook - log in or sign up")) {
			System.out.println("This is facebook");
		}
		else {
			System.out.println("This is not facebook");
		}

	}
}

