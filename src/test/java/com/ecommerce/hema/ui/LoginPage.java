package com.ecommerce.hema.ui;


import com.ecommerce.hema.context.TestContext;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static com.ecommerce.hema.context.EcommContext.UserTypeEnum;

import java.util.Map;

public class LoginPage extends PageObject {
    public void enterEmailAndContinue(UserTypeEnum UserType) {
        TestContext.getEcommContext().addUserDetails(UserType);
        Map userDetails = (Map) TestContext.getEcommContext().getUserDetails();
        $(By.name("dwfrm_preregister_username")).sendKeys(userDetails.get("emailAddress").toString());
        $(By.name("dwfrm_preregister_register")).click();
    }
    public void enterEmailPassToLogin(UserTypeEnum UserType) {
        TestContext.getEcommContext().addUserDetails(UserType);
        Map userDetails = (Map) TestContext.getEcommContext().getUserDetails();
        $(By.id("dwfrm_login_username_default")).sendKeys(userDetails.get("emailAddress").toString());
        $(By.id("dwfrm_login_password_default")).sendKeys(userDetails.get("password").toString());
        $(By.name("dwfrm_login_login")).click();
    }
}
