package GroupTask;
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
		
		//Capture month that currently displayed
        String csSSelector="span[class='ui-datepicker-month']";
        String month=driver.findElement(By.cssSelector(csSSelector)).getText();
        System.out.println("Current month is "+month);
        //loop until month selected
        if(!month.equals("August")){
            do {
                driver.findElement(By.xpath("//span[text()='Next']")).click();
            }while(!driver.findElement(By.cssSelector(csSSelector)).getText().equals("August"));
        }
        //get all cells from table
        String expathCells="//table[@class='ui-datepicker-calendar']/tbody/tr/td";
        List<WebElement>cells=driver.findElements(By.xpath(expathCells));
        for(WebElement cell: cells) {
            String data =cell.getText();
            if(data.equals("10")) {
                cell.click();
                
        boolean submitPresence=driver.findElement(By.cssSelector("input#datepicker")).isDisplayed();
        System.out.println("Date is verified "+submitPresence);
        break;
            
                
     
            }
        }
        Thread.sleep(7000);
        driver.quit();
        
    }
}