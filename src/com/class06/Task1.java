package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Amazon Department List Verification
//		Open chrome browser
//		Go to “http://amazon.com/”
//		Verify how many department options available.
//		Print each department
//		Select Computers
//		Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement dept = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(dept);
		Thread.sleep(2000);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("The total number of departments are: "+allOptions.size());
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		Thread.sleep(2000);
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
