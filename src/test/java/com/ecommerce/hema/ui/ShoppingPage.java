package com.ecommerce.hema.ui;

import static com.ecommerce.hema.context.EcommContext.ProductCategoryEnum;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class ShoppingPage extends PageObject {
    public void verifyShoppingPage() {
        String displayedTxt = $(By.cssSelector("button[class*='categories-btn']")).getText();
        assert (displayedTxt.equalsIgnoreCase("choose category")) : "Login unsuccessful";
    }

        public ShoppingPage(WebDriver driver) {
            super(driver);
        }
        public void clickProductCategory(ProductCategoryEnum productCategory){
            WebElement Categories = getDriver().findElement(By.xpath("//div[@class='featured-sidebar']/ul"));
            List<WebElement> links = Categories.findElements(By.tagName("li"));
            for (int i = 0; i < links.size(); i++)
            {
                if(links.get(i).getText().equalsIgnoreCase(productCategory.toString())){
                    links.get(i).click();
                    break;
                }
            }
        }
        public void clickLogOut(){

            Actions builder = new Actions(getDriver());
            WebElement element = getDriver().findElement(By.xpath("//div[@class= 'profile-wrap']"));
            builder.moveToElement(element).build().perform();
            getDriver().findElement(By.xpath("//div[@class= 'profile-wrap']/div/ul/li[5]/a")).click();



    }




}

