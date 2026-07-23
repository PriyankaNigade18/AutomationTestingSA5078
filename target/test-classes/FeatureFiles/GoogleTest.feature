Feature: Test for Google application

  Background: 
    Given Open Google application

  Scenario: Test for Google page title
    #Given Open Google application
    When get the current title of application
    Then validate title it should matched with Google

  Scenario: Test for valid google search
    #Given Open Google application
    When User search for valid keyword
    Then valid search result should display
