package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAnAccountLink;


























}
