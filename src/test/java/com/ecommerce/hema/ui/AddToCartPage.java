package com.ecommerce.hema.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.ecommerce.hema.context.EcommContext.ProductCategoryEnum;

public class AddToCartPage extends PageObject {
    public void verifyAddToCartPage() {
       assert $("//button[@id='add-to-cart']").isVisible():"Product Selection failed";
    }

    public void addProductToCart()
    {
    $("//button[@id='add-to-cart']").click();
    }


}
