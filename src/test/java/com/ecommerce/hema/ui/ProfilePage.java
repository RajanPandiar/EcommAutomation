package com.ecommerce.hema.ui;

import com.ecommerce.hema.context.TestContext;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Map;

import static com.ecommerce.hema.context.EcommContext.UserTypeEnum;

public class ProfilePage extends PageObject {
    public void verifyProfilePage() {
        String displayedTxt =  $(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/div/h2/a")).getText();
        assert (displayedTxt.equalsIgnoreCase("my Hema")):"Registration unsuccessful";

    }
}


