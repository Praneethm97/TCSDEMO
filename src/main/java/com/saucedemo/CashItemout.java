package com.saucedemo;

import Webpages.CheckoutPage;
import Webpages.SuperTestScript;
import org.testng.annotations.Test;

public class CashItemout extends SuperTestScript {
    @Test(priority=1)
    public void cashOut(){
        CheckoutPage c = new CheckoutPage();
        c.enterFirstName("Jacob");
        c.setLastName("Jones");
        c.setPostalCode("30241");
        c.clickOnContinue();
    }
}
