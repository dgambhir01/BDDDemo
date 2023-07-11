Feature: Test login functionality

  @login @multithread @ui @focus
  Scenario Template: Check login is working with valid credentials
    When user access login page
    And a user provides <userName> and <Password>
    And a user clicks on login
    Then user is navigated to the home page

    Scenarios: 
      | userName | Password |
      | test1    |    12345 |
      | test2    |    12345 |
