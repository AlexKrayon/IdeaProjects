package com.cydeo.test.Day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniunTest {
    public static void main(String[] args) {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- Test if the driver is working as expected
        driver.get("https://www.google.com");






    }

}
