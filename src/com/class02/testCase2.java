package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {
	
//	TC 2: Syntax Page URL Verification:
//		Open chrome browser
//		Navigate to “https://www.syntaxtechs.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Syntax Technologies Page
//		Refresh current page
//		Verify url contains “Syntax”

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Syntax")) {
			System.out.println("Valid url");
		}
		else {
			System.out.println("Unvalid url");
		}
		driver.close();
		
		
		

	}

}
