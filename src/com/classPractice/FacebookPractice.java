package com.classPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPractice {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Facebook dropdown verification
//		Open chrome browser
//		Go to “https://www.facebook.com”
//		Verify:
//		month dd has 12 month options
//		day dd has 31 day options
//		year dd has 115 year options
//		Select your date of birth    
//		Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Select obj;
		List <WebElement> options;
		
		WebElement month=driver.findElement(By.cssSelector("select[name=birthday_month]"));
		obj=new Select(month);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByIndex(2);
		Thread.sleep(2000);
		
		
		WebElement day = driver.findElement(By.cssSelector("select[name*='birthday_day']"));
		obj= new Select(day);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.cssSelector("select[name*='birthday_year']"));
		obj= new Select(year);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByValue("1992");
		Thread.sleep(2000);
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}









