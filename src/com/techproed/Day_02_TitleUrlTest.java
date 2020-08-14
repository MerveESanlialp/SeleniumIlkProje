package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        String baslik = driver.getTitle();

        if (baslik.toLowerCase().contains("video")){
            System.out.println("video kelimesini iceriyor");
        }else{
            System.out.println("video kelimesini icermiyor");
        }
        driver.quit();



    }
}
