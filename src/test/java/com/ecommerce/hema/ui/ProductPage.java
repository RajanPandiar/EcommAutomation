package com.ecommerce.hema.ui;

import com.ecommerce.hema.context.EcommContext;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.ecommerce.hema.context.EcommContext.ProductCategoryEnum;

public class ProductPage extends PageObject {
    public void verifyProductPage(ProductCategoryEnum productCategory) {
        assert $("//h1[@class='filters-heading']").getText().equalsIgnoreCase(productCategory.toString());
    }
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void selectProductFromList(ProductCategoryEnum productCategory)
    {

        Actions builder = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.xpath("//img[@data-productid= '9905057']"));
        builder.moveToElement(element).build().perform();
        getDriver().findElement(By.xpath("//button[@data-productid='9905057']")).click();

    }


}
