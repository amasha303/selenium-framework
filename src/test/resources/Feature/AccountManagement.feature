Feature: Account Management

  Scenario Outline: Create an account using a valid email address
    Given I am on create account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email              | Password     | ConfirmPassword |
      | Damilola  | Adedokun | damade30@gmail.com | Liverpool94. | Liverpool94.    |