Feature: Test Registration functionality

  @login @registration @multithread @ui
  Scenario Outline: Complete registartion
    When user access login page
    And a user provides <userName> and <Password>
    And a user clicks on login
    Then user is navigated to the home page
    Then user enters other fields
    Then user clicks on save
    Then we should see correct message

    Examples: 
      | userName | Password |
      | test1    |    12345 |
      | test2    |    12345 |
