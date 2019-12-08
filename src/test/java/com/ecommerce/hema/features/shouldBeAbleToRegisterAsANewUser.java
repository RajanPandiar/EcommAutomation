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

import static com.ecommerce.hema.context.EcommContext.UserTypeEnum.NEWUSER;


@RunWith(SerenityRunner.class)
public class shouldBeAbleToRegisterAsANewUser {



    @Before
    public void initDriver() {
        TestContext.init();
        ChromeDriverManager.chromedriver().setup();
    }

    @Managed(driver = "chrome")
    WebDriver driver;


    @Steps
    EcommerceUserActions ecommerceNewUser;

    @Test
    public void shouldBeAbleToRegisterAsANewUser() {
        ecommerceNewUser.lauchesBrowser();
        ecommerceNewUser.clicksOnLogin();
        ecommerceNewUser.landOnThePageHavingTitle("sign in");
        ecommerceNewUser.entersEmailAndContinue(NEWUSER);
        ecommerceNewUser.landOnThePageHavingTitle("register");
        ecommerceNewUser.fillsIntheRegistrationForm(NEWUSER);
        ecommerceNewUser.clicksOnContinue();
        ecommerceNewUser.landsOnTheProfilePage();

    }

}


