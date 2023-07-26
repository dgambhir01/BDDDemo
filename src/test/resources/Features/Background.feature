Feature: User Login
  As a registered user
  I want to log in to the application

  Scenario: Login with valid credentials
    Given the website is opened
    And I am on the login page
    When I enter valid credentials
    And I click on login button
    Then I should be logged in

  Scenario: Login with invalid credentials
    Given the website is opened
    And I am on the login page
    When I enter invalid credentials
    Then I should see an error message
    And I should not be logged in
    
    
