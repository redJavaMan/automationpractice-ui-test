package com.automationpractice.tests.pom.pages;

import com.automationpractice.tests.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    private  final By searchFld = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private final By title = By.xpath("//h1[contains(., 'Search results: “Blue”')]");
    private final By addToCartBtn = By.xpath("//h2[text()='Blue Shoes']/parent::a/following-sibling::a");
    public StorePage(WebDriver driver) {
        super(driver);
    }
    public void enterTextInSearchField(String txt){
        driver.findElement(searchFld).sendKeys("Blue Shoes", Keys.ENTER);
    }
    public String getTitle(){
     return driver.findElement(title).getText();
    }
    public void clickAddToCart(){
      driver.findElement(addToCartBtn).click();
    }
}
