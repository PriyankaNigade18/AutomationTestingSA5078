Feature: Test SwagLab application

  Scenario: Test for login
    Given Open swaglab application
    When user enter valid credentials
      | standard_user | secret_sauce |
    And user click on swaglab login button
    Then User should be login and navigated to inventory page
