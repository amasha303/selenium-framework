@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email               | Password     | ConfirmPassword |
      | Damilola  | Adedokun | damade370@gmail.com | Liverpool94. | Liverpool94.    |


  @LoginAccount
  Scenario Outline: Login account using a valid email address
    Given I am on login account page
    When I enter "<Email>" "<Password>"
    And I click on login
    Then My login page is displayed


    Examples:
      | Email               | Password     |
      | damade370@gmail.com | Liverpool94. |