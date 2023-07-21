package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PassWordField;

    @FindBy(css = "#send2 > span")
    public static WebElement LoginButton;

    public AccountLoginPagePO(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassWord(String PassWord){
        PassWordField.sendKeys(PassWord);
    }

    public void clickLoginButton(){
        LoginButton.click();
    }



















}
