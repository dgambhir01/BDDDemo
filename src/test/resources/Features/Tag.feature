@wip
Feature: User Registration
  As a user
  I want to be able to register on the website

  Scenario: Successful registration
    Given the website is accessible
    And I am on the registration page
    When I enter my name as "Dheeraj"
    And I enter my email as "dg@dg.com"
    And I set a password
    And I click on the Register button
    Then I should see a success message

  Scenario: Registration with invalid email
    Given the website is accessible
    And I am on the registration page
    When I enter my name as "Dheeraj"
    And I enter an invalid email
    And I set a password
    And I click on the Register button
    Then I should see an error message regarding the email
