package Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement login;

    public void enterUsername(String user){
        userName.sendKeys(user);
    }
    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void clickOnLogin(){
        login.click();
    }

    public LoginPage(){
        PageFactory.initElements(SuperTestScript.driver,this);
    }
}
