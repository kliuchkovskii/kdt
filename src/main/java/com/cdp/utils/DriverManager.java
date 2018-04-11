package com.cdp.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends ThreadLocal<WebDriver> {
    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            return new ChromeDriver();
        }
    };

    private DriverManager() {
    }

    public static WebDriver getChromeInstance() {
        WebDriver driver = THREAD_LOCAL.get();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {
        WebDriver driver = THREAD_LOCAL.get();
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
