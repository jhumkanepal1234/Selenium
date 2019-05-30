package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookTask {
//	TC 1: Facebook dropdown verification
//	Open chrome browser
//	Go to “https://www.facebook.com”
//	Verify:
//	month dd has 12 month options
//	day dd has 31 day options
//	year dd has 115 year options
//	Select your date of birth    
//	Quit browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Select obj;
		List<WebElement> options;
		
//		month dd has 12 month options
		WebElement month=driver.findElement(By.cssSelector("select[name=birthday_month]"));
		obj=new Select(month);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByIndex(5);
		Thread.sleep(2000);
		
		
//		day dd has 31 day options
		WebElement day=driver.findElement(By.name("birthday_day"));
		obj=new Select(day);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByValue("2");
		Thread.sleep(2000);
		
//		year dd has 115 year options
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		obj=new Select(year);
		options=obj.getOptions();
		System.out.println(options.size());
		obj.selectByVisibleText("1992");
		Thread.sleep(2000);
		
		driver.quit();

	}

}
