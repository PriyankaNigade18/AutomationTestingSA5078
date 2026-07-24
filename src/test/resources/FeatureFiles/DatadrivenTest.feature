Feature: Test Orange HRm app

  Scenario Outline: Test Heml login for Data driven execution
    Given Open Hrm application
    When user enter "<UserName>" and enter "<Password>"
    And User click on Hrm loginButton
    Then as per valid dataset user should able to login

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |
      | Sumit    | test123  |
      | Admin    | admin123 |
      | Kiran    | test123  |
