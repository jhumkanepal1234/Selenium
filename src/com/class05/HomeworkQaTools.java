package com.class05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkQaTools {
	
//	TC 1: Tools QA check all elements
//	Open chrome browser
//	Go to “https://www.toolsqa.com/automation-practice-form/”
//	Fill out:
//	First Name
//	Last Name
//	Check that sex radio buttons are enabled and select “Male”
//	Check all Years of Experience radio buttons are clickable
//	Date
//	Select both checkboxes for profession
//	Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
//	Quit browser

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		

	}

}
