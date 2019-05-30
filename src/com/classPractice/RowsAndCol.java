package com.classPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class RowsAndCol extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		Table headers and rows verification
//		1. Open chrome browser
//		2. Go to “https://the-internet.herokuapp.com/”
//		3. Click on “Click on the “Sortable Data Tables” link
//		4. Verify tables consist of 4 rows and 6 columns
//		5. Print name of all column headers
//		6. Print data of all rows
		
		String url="https://the-internet.herokuapp.com/";
		
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("The total number os rows in the table are: "+rows.size());
		
		for(WebElement rowsText:rows)
			System.out.println(rowsText.getText());
		
		// for Columns
		List <WebElement> col = driver.findElements(By.xpath("//table[@class='tablesorter']/thead/tr/th"));
		System.out.println(col.size());
		
		for(WebElement colText : col)
			System.out.println(colText.getText());
		 
		 
		 
		 
		 
		 
		 
		 
		 Thread.sleep(2000);
		 driver.quit();
		
		
		
	}

}
