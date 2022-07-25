package Webpages;

import UtilLibraries.Validations;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Products {

    @FindBy(className = "product_sort_container")
    private WebElement filter;

    @FindBy(css="div.inventory_list>div")
    private List<WebElement> list;

    @FindBy(css="a#item_0_title_link")
    private WebElement item;

    @FindBy(className = "inventory_details_price")
    private WebElement price;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCart;

    public void filterItems(){
        filter.click();
        filter.sendKeys(Keys.ARROW_DOWN);
        filter.sendKeys(Keys.ARROW_DOWN);
        filter.sendKeys(Keys.ARROW_DOWN);
        filter.sendKeys(Keys.ENTER);
    }
    public void getInventoryCount(){
        System.out.println(list.size());
    }

    public void clickOnItem(){
        item.click();
    }
    public void getPrice(){
        String s = price.getText();
        System.out.println(s);
        boolean status = Validations.ValidationOperation("$9.99",s);
        System.out.println(status);

    }
    public void addItemToCart(){
        addToCart.click();
    }

    public Products(){
        PageFactory.initElements(SuperTestScript.driver,this);
    }

}
