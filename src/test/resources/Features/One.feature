@tagSome
Feature: First feature
  Rule: I want to use this template for my first feature file (Rule keyword is coming soon)

  # this is how you can add comment(s)
  @tag1
  Scenario: First scenario First feature 
    Given I want to write a step with precondition
    And I want to search and confirm some apps domain
      | flipkart | ecommerce   |
      | zepto    | groceries   |
      | twitter  | socialMedia |
    But without login
    When I complete action
    Then I verify the completion in step
    * All good

  Scenario: Valid Registration Form Information with Header 
    Given User submits a valid registration form header
      | FirstName | LastName | Username | Password   | Email              |
      | Dheeraj   | Gambhir  | dgambhir | testPass1  | dgambhir@email.com |
      | MS        | Dhoni    | msd07    | testPass07 | msd@email.com      |
    Then System proceeds with registration
    
