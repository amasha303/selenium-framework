package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Elements Locator - Stage 1

    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;

    @FindBy(id = "password")
    public static WebElement PassWordField;

    @FindBy(id = "password-confirmation")
    public static WebElement PassWordConfirmationField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAnAccountButton;


    //Initialize Elements Using Selenium Webdriver - Stage 2
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Create Methods to describe web element actions - Stage 3

    public void enterFirstName(String FirstName){
        FirstNameField.sendKeys(FirstName);

    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);

    }

    public void enterEmailAddress(String EmailAddress){
        EmailAddressField.sendKeys(EmailAddress);

    }

    public void enterPassWord(String PassWord){
        PassWordField.sendKeys(PassWord);
    }

    public void enterConfirmPassWord(String ConfirmPassWord){
        PassWordConfirmationField.sendKeys(ConfirmPassWord);
    }

    public void clickCreateAccountButton(){
        CreateAnAccountButton.click();
    }


























}
