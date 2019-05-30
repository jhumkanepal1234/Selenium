package com.classPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowManyLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://walmart.com");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links is: "+links.size());
		
		int count=0;
		for(WebElement link:links) {
			String linkText=link.getText();
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("total number of links with text: "+count);
		driver.quit();
		
	}

}
