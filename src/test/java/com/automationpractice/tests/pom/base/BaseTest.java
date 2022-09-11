package com.automationpractice.tests.pom.base;

import com.automationpractice.tests.pom.factory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        driver = new DriverManager().initializeDriver();

    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();

    }
}
