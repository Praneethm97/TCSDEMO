package com.saucedemo;

import Webpages.*;
import org.testng.annotations.Test;

public class Login extends SuperTestScript {
    @Test(priority = 1)
    public void testLogin(){
        LoginPage lp = new LoginPage();
        lp.enterUsername("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickOnLogin();
    }
}
