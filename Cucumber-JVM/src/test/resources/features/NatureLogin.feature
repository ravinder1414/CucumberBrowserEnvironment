
Feature: Nature Login
Scenario: Login user with valid credentials
    Given User navigate to nature.com login page
    When I click on new users link
    Then User should be able to login successfully
    
    Scenario: Login user with invalid credentials
    Given User navigate to nature.com login page
    When I click on new userd link
    Then User should be abled to login successfully

