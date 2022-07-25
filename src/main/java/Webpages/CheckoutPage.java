package Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    @FindBy(id="first-name")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(css="input[data-test='postalCode']")
    private WebElement postalCode;

    @FindBy(name = "continue")
    private WebElement continueButton;

    public void enterFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void setLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void setPostalCode(String postal) {
        this.postalCode.sendKeys(postal);
    }

    public void clickOnContinue(){
        continueButton.click();
    }

    public CheckoutPage(){
        PageFactory.initElements(SuperTestScript.driver,this);
    }
}
