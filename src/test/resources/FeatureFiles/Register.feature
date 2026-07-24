Feature: Test register feature

  Scenario: Test Open Cart Register feature with valid data
    Given Open Opencart regitration page
    When user enter required data
      | fname | lname  | email | telephone | password | cpassword |
      | Pooja | Sharma | pooja |    898098 | test123  | test123   |
    And user select yes newsletter
    And user select privacy policy
    And user click on Continue
    Then new user registration should completed
