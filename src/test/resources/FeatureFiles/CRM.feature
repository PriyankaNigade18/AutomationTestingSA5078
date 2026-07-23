Feature: Test CRM application

  Background: 
    Given Open CRM application
    When user click on SignIn

  Scenario: Test for SignIn link
    #Given Open CRM application
    #When user click on SignIn
    Then It should navigate to LoginPage

  Scenario: Test for Login with valid credentials
    #Given Open CRM application
    #When user click on SignIn
    And user enter email "test@gmail.com" and enter password "test123"
    And user click on submit button
    Then user should be login and navigate to customer page
