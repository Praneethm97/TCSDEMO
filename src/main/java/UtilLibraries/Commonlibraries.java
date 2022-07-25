package UtilLibraries;

import Webpages.SuperTestScript;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class Commonlibraries {
    public static void selectDropdownByIndex(WebElement ele,int index){
        Select s = new Select(ele);
        s.selectByIndex(index);
    }
    public static void selectDropdownByVisibletext(WebElement ele,String value){
        Select s = new Select(ele);
        s.selectByVisibleText(value);
    }
    public static void acceptAlert(){
        SuperTestScript.driver.switchTo().alert().accept();
    }
    public static void dismissAlert(){
        SuperTestScript.driver.switchTo().alert().dismiss();
    }
    public static String getAlertText(){
        String s = SuperTestScript.driver.switchTo().alert().getText();
        return s;
    }
    public static void Color(WebElement rv){
        JavascriptExecutor js = (JavascriptExecutor) SuperTestScript.driver;
        js.executeScript("arguments[0].setAttribute('style','border:2px solid red ; background: yellow')",rv);
    }
    public static void takeScreenshot(String name) throws Exception{
        TakesScreenshot ts = (TakesScreenshot) SuperTestScript.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("F:\\SwagLabs\\src\\test\\resource\\screenshots\\"+name+".jpg");
        FileUtils.copyFile(source,dest);
    }
}
