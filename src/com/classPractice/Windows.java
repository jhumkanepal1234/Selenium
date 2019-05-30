package com.classPractice;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;

import utils.CommonMethods;

public class Windows extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentId =  driver.getWindowHandle();
		System.out.println("Title: "+parent+" "+"Id "+parentId);
		
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Set <String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		child=driver.getTitle();
		String childId=driver.getWindowHandle();
		System.out.println("Title: "+child+" "+"Id "+childId);
		
		
		
		
		
		driver.quit();

	}

}
