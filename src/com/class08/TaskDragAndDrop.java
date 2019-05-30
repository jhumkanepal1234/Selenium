package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskDragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.cssSelector("div[class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement drop = driver.findElement(By.cssSelector("div[class='ui-widget-header ui-droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
