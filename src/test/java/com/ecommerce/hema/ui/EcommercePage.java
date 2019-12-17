package com.ecommerce.hema.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.hema.com/en-gb")
public class EcommercePage extends PageObject {
    public void clickOnLoginBtn() {
        $("//div[@class='profile-wrap']/a").click();
    }

}
