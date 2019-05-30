package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TaskWindowHandle extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		@all TC 1: ToolsQA Windows verification
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Multiple Windows” link
//		Click on “Elemental Selenium”
//		Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//		Close second window
//		Click on “Click Here” link
//		Verify title if newly open window is “New Window”
//		Close second window
//		Verify title of second window is “The Internet”
//		Quit browser
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		String parent=driver.getTitle();
		String parentId=driver.getWindowHandle();
		System.out.println("Title of parent is : "+parent+" and the Id is: "+parentId);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		Set <String> allWindows = driver.getWindowHandles();
		Iterator <String> it = allWindows.iterator();
		parent=it.next();
		String child= it.next();
		
		driver.switchTo().window(child);
		child=driver.getTitle();
		System.out.println("Title of window child is : "+child);
//		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parent);    // now switching to parent window 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		Iterator <String> it2 = allWindows.iterator();
		//parent=it2.next();
		String child2=it2.next();
		driver.switchTo().window(child2);
		child2=driver.getTitle();
		System.out.println("Title of window child2 is : "+child2);
		Thread.sleep(3000);
		driver.close();
		
		
		Iterator <String> it3 = allWindows.iterator();
		parent=it3.next();
		String child3=it3.next();
		driver.switchTo().window(child3);
		child3=driver.getTitle();
		System.out.println("Title of window child3 is : "+child3);
		
		
		
		
		
		
		
		
		
	Thread.sleep(2000);	
	driver.quit();
    
	}

}
