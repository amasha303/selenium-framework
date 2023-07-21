package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.AccountLoginPagePO;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create account page")
    public void iAmOnCreateAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmailAddress(Email);
        createAccountPagePO.enterPassWord(Password);
        createAccountPagePO.enterConfirmPassWord(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Given("I am on login account page")
    public void iAmOnLoginAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String PassWord) {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.enterEmail(Email);
        accountLoginPagePO.enterPassWord(PassWord);
    }

    @And("I click on login")
    public void iClickOnLogin() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickLoginButton();

    }

    @Then("My login page is displayed")
    public void myLoginPageIsDisplayed() {
    }
}
