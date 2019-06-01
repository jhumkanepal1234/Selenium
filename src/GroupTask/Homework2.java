package GroupTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;


public class Homework2 extends CommonMethods {
    public static void main(String[] args) {
        CommonMethods.setUpDriver("chrome",
                "http://secure.smartbearsoftware.com/sa" + "mples/testcomplete11/WebOrders/login.aspx");
        WebElement usernameBox = driver.findElement(By.cssSelector("input[id$='MainContent_username']"));
        CommonMethods.sendText(usernameBox, "Tester");

        WebElement passwordBox = driver.findElement(By.cssSelector("input[id$='MainContent_password']"));
        CommonMethods.sendText(passwordBox, "test");
        String custName = "John Doe";
        String address = "1234 FakeStreet";
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id=ctl00_MainContent_fmwOrder_txtQuantity")),"1");
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_txtName']")),custName);
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox2']")),address);
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox3']")),"Atlanta");
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox4']")),"Georgia");
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox5']")),"22517");
        driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox6']")),"1234567890");
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox1']")),"02/22");
        driver.findElement(By.cssSelector("a[id='ctl00_MainContent_fmwOrder_InsertButton']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'View all orders')]")).click();
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for (int i = 1; i <= rows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]"));
            String rowText = row.getText();
            System.out.println("Row " + i + " text is " + rowText);
            if (rowText.contains(custName)) {
                System.out.println("Customer name is displayed");
                System.out.println(rowText);
                driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[13]")).click();
                break;
            }
           
        }

        address = "Coding avenue";
        CommonMethods.sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox2']")),
                address);
        
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
        for (int i = 1; i <= rows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]"));
            String rowText = row.getText();
            System.out.println("Row " + i + " text is " + rowText);
            if (rowText.contains(address)) {
                System.out.println("Address has been updated");
                System.out.println(rowText);
                break;
            }

        }
        driver.quit();
    }
}