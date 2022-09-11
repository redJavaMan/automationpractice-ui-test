package com.automationpractice.tests;

import com.automationpractice.tests.pom.base.BaseTest;
import com.automationpractice.tests.pom.pages.HomePage;
import com.automationpractice.tests.pom.pages.StorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

 //   @BeforeClass
   // public void setup() {
     //   WebDriverManager.chromedriver().setup();
    //}

    @Test
    public void validLogin() throws InterruptedException {
        driver.get("http://askomdch.com");
        HomePage homePage = new HomePage(driver);
        StorePage storePage = homePage.clickStoreMenuLink();
        storePage.enterTextInSearchField("Blue Shoes");
        Assert.assertEquals(storePage.getTitle(),"Search results: “Blue”");
        storePage.clickAddToCart();



       // WebElement store = driver.findElement(By.xpath("//a[contains(.,'Store')]"));
        //store.click();
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']"));
        search.sendKeys("Blue", Keys.ENTER);
        Assert.assertEquals(
                driver.findElement(By.xpath("//h1[contains(., 'Search results: “Blue”')]")).getText(),
                "Search results: “Blue”");
        WebElement addToCart = driver.findElement(By.xpath("//h2[text()='Blue Shoes']/parent::a/following-sibling::a"));
        addToCart.click();
        Thread.sleep(3000);
        WebElement viewCart = driver.findElement(By.xpath("(//a[contains(.,'View cart')])[3]"));
        viewCart.click();
        Assert.assertEquals(driver.findElement(By.xpath("//a[contains(.,'Blue Shoes')]")).getText(), "Blue Shoes");
        WebElement proceedToCheckOut = driver.findElement(By.xpath("//a[contains(.,'Proceed to checkout')]"));
        proceedToCheckOut.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
        firstName.sendKeys("Mohammed");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        lastName.sendKeys("Lukmanudhin");
        WebElement companyName = driver.findElement(By.xpath("//input[@id='billing_company']"));
        companyName.sendKeys("Amazon");
        WebElement country = driver.findElement(By.xpath("//span[@id='select2-billing_country-container']"));
        country.click();
        WebElement countryTextBox = driver.findElement(By.xpath("//span//span[1]/input"));
        countryTextBox.sendKeys("United Arab Emirates", Keys.ENTER);
        WebElement address = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
        address.sendKeys("Dubai Kuruku Sandhu");
        WebElement apartment = driver.findElement(By.xpath("//input[@id='billing_address_2']"));
        apartment.sendKeys("Kerala Apartment");
        WebElement city = driver.findElement(By.xpath("//input[@id='billing_city']"));
        city.click();
        city.sendKeys("Newyork", Keys.ENTER);
        WebElement state = driver.findElement(By.xpath("//input[@id='billing_state']"));
        state.sendKeys("Sharjah");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='billing_phone']"));
        phoneNumber.sendKeys("9941234567");
        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='billing_email']"));
        emailAddress.sendKeys("abcd@gmail.com");
        WebElement orderNotes = driver.findElement(By.xpath("//textarea"));
        orderNotes.sendKeys("Gift");
        WebElement cashOnDelivery = driver.findElement(By.xpath("//input[@id='payment_method_cod']"));
        cashOnDelivery.click();
        WebElement placeOrder = driver.findElement(By.xpath("//button[@id='place_order']"));
        placeOrder.click();


    }
}
