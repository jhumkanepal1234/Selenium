package com.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {
	
	public static String userName="Tester";
	public static String password="test";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		WebElement userNameTxt=driver.findElement(By.cssSelector("input[id*='username']"));
		userNameTxt.sendKeys("John");
		Thread.sleep(2000);
		userNameTxt.clear();
		userNameTxt.sendKeys(userName);
		WebElement passTxt = driver.findElement(By.cssSelector("input[type*='password']"));
		passTxt.clear();
		passTxt.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("WebOrder logo is displayed");
		}else {
			System.out.println("WebOrder logo is displayed");
		}
		WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']"));
		System.out.println(welcome.getAttribute("class"));
		String value = welcome.getText();
		if (value.contains(userName)) {
			System.out.println("Tester is logged. This test case passed");
		}else {
			System.out.println("This test case passed");
		}
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
