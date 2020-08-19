package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day_03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

       // Websayfasindaki tum elemanlari Webelement ile tanimlamak lazim
        // click buldugun webelementi tikla
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();


        WebElement emailkutusu = driver.findElement(By.id("session_email"));
        emailkutusu.click();
        // email kutusuna mail adresi yaziyoruz
        emailkutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        // sifreKutusu na sifreyi yaziyoruz
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String titel = driver.getTitle();
        driver.close();

        if (titel.equals("Address Book")){
            System.out.println("Giris basarili");
        } else{
            System.out.println("Giris Barasisiz");
        }







    }
}
