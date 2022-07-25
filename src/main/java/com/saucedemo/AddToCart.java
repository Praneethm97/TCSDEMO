package com.saucedemo;

import Webpages.*;
import org.testng.annotations.Test;

public class AddToCart extends SuperTestScript {
    @Test
    public void addToCart(){
        Products p = new Products();
        p.filterItems();
        p.getInventoryCount();
        p.clickOnItem();
        p.getPrice();
        p.addItemToCart();
    }
    @Test
    public void cart(){
        Cart c = new Cart();
        c.getNoOfItemsInCart();
        c.clickOnShoppingCart();
        c.clickCheckout();
    }
}
