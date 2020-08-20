package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();

        String sayfaTitle = webDriver.getTitle();
        System.out.println(sayfaTitle);

        webDriver.navigate().to("https://www.youtube.com/");
        String youTitle = webDriver.getTitle();
        String youUrl = webDriver.getCurrentUrl();

        System.out.println(youTitle);
        System.out.println(youUrl);

        webDriver.navigate().back();
        String goUrl = webDriver.getCurrentUrl();
        System.out.println(goUrl);
        webDriver.quit();

    }
}
