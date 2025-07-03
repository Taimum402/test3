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
        // driver.manage().window().maximize();
        // driver.navigate().to("https://tinyurl.com/app/register");
        // driver.findElement(By.xpath("//*[@id=\"signup_name\"]")).sendKeys("Taimum");
        // driver.findElement(By.xpath("//*[@id=\"signup_email\"]")).sendKeys("taimum08@gmail.com");
        // driver.findElement(By.xpath("//*[@id=\"signup_password\"]")).sendKeys("Islam420");
        //driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("01321010110");
        // driver.findElement(By.xpath("//*[@id=\"signup_signup_btn\"]/span")).click();



        Thread.sleep(10000);

    }
}