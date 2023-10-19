package com.mkan;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("hello man");
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("123")
                .setApp("/home/myapp.apk")
                ;
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.21.0.2:4723"), options
        );
        try {
            WebElement el = driver.findElement(AppiumBy.xpath("//Button"));
            el.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}