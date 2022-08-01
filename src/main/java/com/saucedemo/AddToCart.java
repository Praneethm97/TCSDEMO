package com.saucedemo;

import Webpages.*;
import org.testng.annotations.Test;

public class AddToCart extends SuperTestScript {
    @Test(priority = 1)
    public void addToCart(){
        Products p = new Products();
        p.filterItems();
        p.getInventoryCount();
        p.clickOnItem();
        p.getPrice();
        p.addItemToCart();
    }
    @Test(priority = 1)
    public void cart(){
        Cart c = new Cart();
        c.getNoOfItemsInCart();
        c.clickOnShoppingCart();
        c.clickCheckout();
    }
}
