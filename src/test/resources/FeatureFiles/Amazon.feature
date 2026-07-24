@All
Feature: Test Amazon app

  Background: 
    Given Open Amazon application

  @homePage @smokeTest @ignore
  Scenario: Test Homepage title
    When User get the homepage title
    Then Title should matched with HomePage

  @freshPage @Functional @ignore
  Scenario: Test Freshpage title
    When User open Fresh page
    And User get the freshpage title
    Then Title should matched with freshPage

  @sellPage @Regression
  Scenario: Test Sellpage title
    When User open Sell page
    And User get the Sellpage title
    Then Title should matched with SellPage

  @MobilesPage @Regression @ignore
  Scenario: Test Mobiles page title
    When User open Mobilespage
    And User get the mobilespage title
    Then Title should matched with MobilesPage
