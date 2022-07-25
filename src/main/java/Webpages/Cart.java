package Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartbadge;

    @FindBy(xpath = "//button[@data-test='checkout']")
    private WebElement checkoutButton;

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }

    public void getNoOfItemsInCart(){
        System.out.println(shoppingCartbadge.getText());
    }

    public void clickCheckout(){
        checkoutButton.click();
    }

    public Cart(){
        PageFactory.initElements(SuperTestScript.driver,this);
    }
}
