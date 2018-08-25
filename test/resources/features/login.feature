Feature: Login
  In order to use the website, all users must login with valid email and password

  Background: This steps must run for all scenarios
    Given I navigate to the website
    When I click on login

  Scenario Outline: Valid login
    When I enter lgin email as "<email>"
    And I enter login password as "<password>"
    And I click on Secure Sign in
    Then I am signed in
    And I close the website


    Examples:
    |email|password|
    |buzzymine4real@yahoo.co.uk|ola123|



    Scenario Outline: Invalid login
      When I enter my email as "<email>"
      And I enter my password as "<password>"
      Then I am not logged in
      And I close the website

      Examples:
      |email|password|
      |buzzymine@.com|ola123|
      |buzzymine4real@yahoo.co.uk|ola12|