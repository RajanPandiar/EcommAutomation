package com.ecommerce.hema.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.hema.com/en-gb")
public class EcommercePage extends PageObject {
    public void clickOnLoginBtn() {
        $("/html/body/div[1]/header/div/div[2]/div/div[3]/div[1]/a").click();
    }

}
