package com.ecommerce.hema.ui;

import static com.ecommerce.hema.context.EcommContext.UserTypeEnum;

import com.ecommerce.hema.context.TestContext;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Map;

public class RegistrationPage extends PageObject {
    public void fillInTheRegForm(UserTypeEnum UserType) {

    TestContext.getEcommContext().addUserDetails(UserType);
    Map newUserDetails = (Map) TestContext.getEcommContext().getUserDetails();
        $("//*[@id=\"RegistrationForm\"]/div[1]/div[1]/fieldset[1]/div/div/div[1]/label").click();
        $(By.id("dwfrm_profile_customer_name_firstname_GB")).sendKeys(newUserDetails.get("firstName").toString());
        $(By.id("dwfrm_profile_customer_name_lastname_GB")).sendKeys(newUserDetails.get("lastName").toString());
        $(By.id("dwfrm_profile_address_address1_GB")).sendKeys(newUserDetails.get("address").toString());
        $(By.id("dwfrm_profile_address_postal_GB")).sendKeys(newUserDetails.get("postalCode").toString());
        $(By.id("dwfrm_profile_address_city_GB")).sendKeys(newUserDetails.get("city").toString());
        $(By.id("dwfrm_profile_login_password_GB")).sendKeys(newUserDetails.get("password").toString());
        $(By.id("dwfrm_profile_login_passwordconfirm_GB")).sendKeys(newUserDetails.get("password").toString());

    }
    public void clickOnContinue() {
        $(By.name("dwfrm_profile_confirm")).click();
    }
    }
