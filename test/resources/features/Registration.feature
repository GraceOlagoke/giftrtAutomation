Feature: Registration.
  in order to use https://www.giftrete.com, all users must register

  Background: this steps must always run for every scenarios

    Given I navigate to the website
    When I click on Register



  Scenario: Valid registration details

    And I enter my first name
    And I enter my last name
    And I enter my email
    And I enter my Phone number
    And I enter my password
    And I confirmed my password
    And I click on Sign up
    Then I am registered
    And I close the webpage


    Scenario Outline:  Registration with invalid  details
      When I enter my registration first name as "<firstname>"
      And I enter my registration last name as "<lastname>"
      And I enter my registration email as "<email>"
      And I enter registration password as "<password>"
      And I enter my registration confirm password as  "<confirmpassword>"
      And I click on Sign up
      Then I am not registered
      And I close the webpage

      Examples:

      |firstname|lastname|email|password|confirmpassword|
      |"Kevin    |Rita    |kevin.rita@yahoo.com|test123|test123|
      |Kevin     |"Rita   |kevin.rita@yahoo.com|test123|test123|
      |Kevin     |Rita    |kevin.rita@yahoo.com|       |       |
      |Fola     |Jinmin  |folajinmi2002@hotmail.com|test123|tester123|
      |Terry    |Baptiste|baptist07.testin.com     |test123|test123  |


