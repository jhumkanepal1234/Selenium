package com.classPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
//			1) Open chrome browser
//			2) Go to "https://www.amazon.com/"
//			3) Using Iterator get text of each link
//			4) Get number of links that has text
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The total numbers of link in this website is: "+links.size());
		
		int count=0;
		
		Iterator<WebElement> linksIt=links.iterator();
		while(linksIt.hasNext()) {
			String linkText=linksIt.next().getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("Total # of links with text "+count);
		driver.quit();
		

	}

}
