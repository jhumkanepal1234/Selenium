package com.class10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class homeWork1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		Users Application Form Fill
//		1. Open chrome browser
//		2. Go to “http://uitestpractice.com/”
//		3. Click on “Forms” link
//		4. Fill out the entire form
//		5. Close the browser
		
		String url="http://uitestpractice.com/";
		setUpDriver("chrome", url);
		
		
		String firstName="Rockstar";
		String lastName="Batch4";
		String country="Denmark";
		String birthDate="02/09/2019";
		String phoneNumber="9999999999";
		String userName="rock_star@yahoo.com";
		String email="rock_star@yahoo.com";
		String comment="Hello everyone, our group is named as Rockstar that will rock the market after we finish our bootcamp. ";
		String password="Syntax123";
		
		
		driver.findElement(By.xpath("//a[text()='Form']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[placeholder*='Enter FirstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@placeholder='Enter LastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='optradio']")).click();
		driver.findElement(By.xpath("//input[@value='read']")).click();
		driver.findElement(By.xpath("//select[@class='form-control dropdown-header']")).click();
		
		WebElement countriesDd = driver.findElement(By.xpath("//select[@class='form-control dropdown-header']"));
		Select select = new Select(countriesDd);
		select.getOptions();
		select.selectByVisibleText(country);
		
		driver.findElement(By.xpath("//input[@value='read']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Date of birth']")).sendKeys(birthDate);
		driver.findElement(By.xpath("//input[@placeholder='Enter PhoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@class='form-control test']")).sendKeys(comment);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		driver.quit();
	}

}
