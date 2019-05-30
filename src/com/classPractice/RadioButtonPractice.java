package com.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio = driver.findElement(By.id("sex-0"));
		
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println(maleRadio.isSelected());
		
		maleRadio.click();
		System.out.println(maleRadio.isSelected());
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
