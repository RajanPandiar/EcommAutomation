package com.ecommerce.hema.steps;

import com.ecommerce.hema.context.EcommContext;
import com.ecommerce.hema.ui.*;
import net.thucydides.core.annotations.Step;
import static com.ecommerce.hema.context.EcommContext.UserTypeEnum;
import static com.ecommerce.hema.context.EcommContext.ProductCategoryEnum;

import java.awt.color.ProfileDataException;


public class EcommerceUserActions {
    EcommercePage ecommercePage;
    LoginPage loginPage;
    CurrentPage currentPage;
    RegistrationPage registrationPage;
    ProfilePage profilePage;
    ShoppingPage shoppingPage;
    ProductPage productPage;
    AddToCartPage addToCartPage;
    CartContentsPage cartContentsPage;


    @Step("Given a Ecommerce User")
    public void lauchesBrowser() {
        ecommercePage.open();
    }
    @Step("When he clicks on the login button")
    public void clicksOnLogin() {
        ecommercePage.clickOnLoginBtn();
    }
    @Step("Then the Page is loaded successfully")
    public void landOnThePageHavingTitle(String expectedTitle) {
        currentPage.getTitle().equalsIgnoreCase(expectedTitle);
    }
    @Step("When he enters his email address and continues")
    public void entersEmailAndContinue(UserTypeEnum UserType) {
        loginPage.enterEmailAndContinue(UserType);
    }
    @Step("When he fills in the Registration form ")
    public void fillsIntheRegistrationForm(UserTypeEnum UserType) {
        registrationPage.fillInTheRegForm(UserType);
    }
    @Step("When he clicks on continue")
    public void clicksOnContinue() {
        registrationPage.clickOnContinue();
    }
    @Step("Then he lands on the profile page")
    public void landsOnTheProfilePage() {
        profilePage.verifyProfilePage();
    }
    @Step("When he enters email and password to login")
    public void entersEmailAndPasswordToLogin(UserTypeEnum UserType){
        loginPage.enterEmailPassToLogin(UserType);
    }
    @Step("Then he lands on the shopping page")
    public void landsOntheShoppingPage() {
        shoppingPage.verifyShoppingPage();
    }
    @Step("When he clicks on a particular product category")
    public void clickOnTheCategoryOfHisChoice(ProductCategoryEnum productCategory) {
        shoppingPage.clickProductCategory(productCategory);
    }
    @Step("Then he lands on the products page")
    public void landsOntheChosenProductPage(ProductCategoryEnum productCategory) {
        productPage.verifyProductPage(productCategory);
    }
    @Step("When he selects a product from list")
    public void selectsAProductFromList(ProductCategoryEnum productCategory) {
        productPage.selectProductFromList(productCategory);
    }
    @Step("Then the add to cart page is displayed")
    public void landsOntheAddtoCartPage() {
        addToCartPage.verifyAddToCartPage();
    }
    @Step("When he adds a product to cart")
    public void addAProductToCart() {
        addToCartPage.addProductToCart();
    }
    @Step("Then he can see that the product is added to the cart")
    public void canSeeThatProductIsAddedToCart() {
        cartContentsPage.verifyProductAddedToCart();
    }
    @Step("When he wants to view the contents of the shopping basket")
    public void viewsTheContentsOfTheShoppingBasket() {
        cartContentsPage.clickOnTheViewBasket();
    }
    @Step("When he wants to log out")
    public void clicksOnLogOut() {
        shoppingPage.clickLogOut();
    }

}
