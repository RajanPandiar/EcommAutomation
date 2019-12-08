package com.ecommerce.hema.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartContentsPage extends PageObject {

    public void verifyProductAddedToCart()
        { assert $(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[3]/div[5]/div[2]/div[2]/div/div[2]/a")).isVisible():"product not added to cart";
    }

    public void clickOnTheViewBasket()
    {
        $(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[3]/div[5]/div[2]/div[2]/div/div[2]/a")).click();
    }
}
