package com.class10;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class homework3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		Table headers and rows verification
//		1. Open chrome browser
//		2. Go to “https://jqueryui.com/”
//		3. Click on “Datepicker”
//		4. Select August 10 of 2019
//		5. Verify date “08/10/2019” has been entered succesfully
//		6. Close browser
		
		String url="https://jqueryui.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String expectedMonth="October";
		String expectedYear="2019";
		
		
		WebElement months = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		while(true) {
			if(months.getText().equalsIgnoreCase(expectedMonthAndYear)){
				break;
				
			}else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
