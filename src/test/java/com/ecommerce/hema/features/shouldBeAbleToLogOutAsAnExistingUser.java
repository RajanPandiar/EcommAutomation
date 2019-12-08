package com.ecommerce.hema.features;

import com.ecommerce.hema.context.TestContext;
import com.ecommerce.hema.steps.EcommerceUserActions;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.ecommerce.hema.context.EcommContext.UserTypeEnum.EXISTINGUSER;


@RunWith(SerenityRunner.class)
public class shouldBeAbleToLogOutAsAnExistingUser {



    @Before
    public void initDriver() {
        TestContext.init();
        ChromeDriverManager.chromedriver().setup();
    }

    @Managed(driver = "chrome")
    WebDriver driver;


    @Steps
    EcommerceUserActions ecommerceExistingUser;

    @Test
    public void shouldBeAbleToLogOutAsAnExistingUser() {
        ecommerceExistingUser.lauchesBrowser();
        ecommerceExistingUser.clicksOnLogin();
        ecommerceExistingUser.landOnThePageHavingTitle("sign in");
        ecommerceExistingUser.entersEmailAndPasswordToLogin(EXISTINGUSER);
        ecommerceExistingUser.landsOntheShoppingPage();
        ecommerceExistingUser.clicksOnLogOut();
        ecommerceExistingUser.landOnThePageHavingTitle("sign in");

    }

}


