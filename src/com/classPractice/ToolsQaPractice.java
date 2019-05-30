package com.classPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaPractice {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Tools QA check all elements
//		Open chrome browser
//		Go to “https://www.toolsqa.com/automation-practice-form/”
//		Fill out:
//		First Name
//		Last Name
//		Check that sex radio buttons are enabled and select “Male”
//		Check all Years of Experience radio buttons are clickable
//		Date
//		Select both checkboxes for profession
//		Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
//		Quit browser

		System.setProperty("webdriver.chrome.driver", "/Users/asmitnepal/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");

		driver.findElement(By.cssSelector("input[name*='firstname']")).sendKeys("Moe");
		driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Ali");
		Thread.sleep(2000);

		List<WebElement> sexButton = driver.findElements(By.cssSelector("input[name*='sex']"));
		String buttonToSelect = "Male";
		for (WebElement sex : sexButton) {
			if (sex.isEnabled()) {
				sex.click();
			}
		}

		List<WebElement> expButton = driver.findElements(By.cssSelector("input[name*='exp']"));
		for (WebElement button : expButton) {
			if (button.isEnabled()) {
				button.click();
				Thread.sleep(2000);
			}
		}

		String valueToSelect = "Automation Tester";
		List<WebElement> professionList = driver.findElements(By.name("profession"));

		System.out.println(professionList.size());

		for (WebElement profession : professionList) {

			if (profession.isEnabled()) {

				String value = profession.getAttribute("value");
				System.out.println(value);

				if (value.equals(valueToSelect)) {
					profession.click();
					Thread.sleep(3000);
				}
			}
		}

		List<WebElement> autoTool = driver.findElements(By.name("tool"));
		String toolSelected = "Selenium WebDriver";
		for (WebElement automation : autoTool) {
			if (automation.isEnabled()) {
				automation.click();
				String value = automation.getAttribute("value");
				System.out.println(value);

				if (!value.equalsIgnoreCase(toolSelected)) {
					automation.click();
					Thread.sleep(3000);
				}
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
