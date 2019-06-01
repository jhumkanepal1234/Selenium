package com.class11;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(3000);
		
		String filePath="/Users/asmitnepal/Desktop/UploadFile.jpg";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File didn't uploaded successfully");
		}
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}
}