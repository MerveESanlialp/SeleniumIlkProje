package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day_04GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("city bike");
        search.submit();

        WebElement lastnumber = driver.findElement(By.id("result-stats"));
        System.out.println(lastnumber.getText());

        WebElement shoppingLink = driver.findElement(By.partialLinkText("Shopping"));
        shoppingLink.click();

        driver.close();


    }
}
