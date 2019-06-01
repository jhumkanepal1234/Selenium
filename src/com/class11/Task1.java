package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;
public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
//		TC 1: Upload file and Take Screenshot

//		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//		Upload file
//		Verify file got successfully uploaded and take screenshot
		
		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		
		String filePath="/Users/asmitnepal/Desktop/Upload2.jpg";
		driver.findElement(By.xpath("//input[@class='gwt-FileUpload']")).sendKeys(filePath);
		driver.findElement(By.xpath("//button[text()='Upload File']")).click();
		
		
		String expected = "File uploaded!";
		
		Alert alert=driver.switchTo().alert();
		String textActual=alert.getText();
		alert.accept();
		
		
		if(textActual.equalsIgnoreCase(expected)) {
			System.out.println("File uploaded");
		}else {
			System.out.println("File didn't upload");
		}
		
		
		
		TakesScreenshot camera=(TakesScreenshot)driver;
		File photo=camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(photo, new File("Screenshot/Task/GoolePage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot not taken");
		}
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
