package com.saucedemo;

import Webpages.CheckoutPage;
import org.testng.annotations.Test;

public class CashItemout {
    @Test
    public void cashOut(){
        CheckoutPage c = new CheckoutPage();
        c.enterFirstName("Jacob");
        c.setLastName("Jones");
        c.setPostalCode("30241");
        c.clickOnContinue();
    }
}
