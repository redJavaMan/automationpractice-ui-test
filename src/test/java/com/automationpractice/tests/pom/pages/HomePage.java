package com.automationpractice.tests.pom.pages;

import com.automationpractice.tests.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By storeMenuLink = By.xpath("//a[contains(.,'Store')]");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    // only when page is navigated to other page
    public StorePage clickStoreMenuLink(){
        driver.findElement(storeMenuLink).click();
        return new StorePage(driver);
    }
    // when page is not navigated
   // public void clickStoreMenuLink(){
     //   driver.findElement(storeMenuLink).click();
    //}
}
