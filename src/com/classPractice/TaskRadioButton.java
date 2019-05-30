package com.classPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// Check all Years of Experience radio buttons are clickable
//		* -----------------------------------------------
//		* Check all Automation Tools checkboxes are clickable
//		* and keep “Selenium WebDriver” option as selected
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		// Check all Years of Experience radio buttons are clickable
		List <WebElement> radioButton = driver.findElements(By.cssSelector("input[name^='exp']"));
		for(WebElement radio : radioButton) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
	
//		* Check all Automation Tools checkboxes are clickable
		 List <WebElement> autoTool = driver.findElements(By.name("tool"));
		 String toolSelected = "Selenium WebDriver";
		 for(WebElement automation : autoTool) {
			 if(automation.isEnabled()) {
				 automation.click();
				 String value=automation.getAttribute("value");
			     System.out.println(value);
			     
			 if(!value.equalsIgnoreCase(toolSelected)) {
				 automation.click();
			 }
		 }
		 }
		
		
		Thread.sleep(2000);
		driver.quit();

	}
	}


