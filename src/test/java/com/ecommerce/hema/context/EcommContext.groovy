package com.ecommerce.hema.context

import com.ecommerce.hema.TestData.TestData
import org.openqa.selenium.WebDriver

class EcommContext {
    enum UserTypeEnum { NEWUSER, EXISTINGUSER }
    enum ProductCategoryEnum { CHRISTMAS, BABY, STATIONERY }
    UserTypeEnum userType
    ProductCategoryEnum productCategory
    def userDetails = []
    boolean chrome;

    def addUserDetails(UserTypeEnum userType) {
        userDetails = TestData.Users[userType.name()]

    }


}
