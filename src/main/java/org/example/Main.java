package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        //driver.navigate().to("https://spcollegehilsa.in/spcollege_degree2/admin-login.php");
            driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Taimum1");
            driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("420");
            driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Dhaka");
            driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Dhaka");
            driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Bangladesh");
            driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("1100");
            driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("01636252824");
            driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("T331");
            driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Taimum420");
            driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("Tuhin420");
            driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("Tuhin420");

               driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
               driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Taimum420");
               driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Tuhin420");


                        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
                        driver.get("https://parabank.parasoft.com/parabank/requestloan.htm");
                        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
                        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("24444");
                        driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("3888");
                //driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Dhaka");
                //driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Dhaka2");
               // driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("1100");
                //driver.findElement(By.xpath("//*[@id=\"fd97d15a-5d95-4baa-a331-212c2367bea6\"]")).sendKeys("01636282839");
               // driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("12345");
                //driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("12345");
                //driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("12345");
                //driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("120");
                        driver.findElement(By.xpath("//*[@id=\"requestLoanForm\"]/form/table/tbody/tr[4]/td[2]/input")).click();
                        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();



         // driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();
       // driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[4]/div/ul/li[2]/a")).click();
        // driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();
        // driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[4]/div/ul/li[2]/a")).click();
        // driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();
        // driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[4]/div/ul/li[2]/a")).click();
        // day 1 closed.



        Thread.sleep(10000);

    }
}