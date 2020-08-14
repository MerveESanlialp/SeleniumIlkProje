package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        // tam ekran yapiyor
        webDriver.manage().window().maximize();

        // driver'a google.com'a gitmesini soyledik
        webDriver.get("https://www.google.com/");

        // get komutu ile ayni islemi yapiyor
        webDriver.navigate().to("https://www.amazon.com/ref=nav_logo");

        // navigate().back() methodu bir onceki sayfaya geri donmeye yariyor
        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

    }
}
