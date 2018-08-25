Feature: Wish List
  As a user of the website, I should be able to create and view all my wish lists

  Background: These steps must always run for every scenarios in this feature

    //Given I navigate to the website
    Given I Login


    Scenario: Valid Create wish list for myself with privacy setting "make it public"
      When I click on wishlist
      And I click on create wish list
      And I select wish list for myself
      And I enter name of the occasion
      And I enter the occasion
      And I  enter the event date
      And I select the product type
      And I enter the description
      And I select private policy make it public
      And I click on submit
      Then my wish list is created
      And I close the webpage


  Scenario: Valid Create wish list for a friend
    When I click on create wishlist
    And I select wish list for for a friend
    And I enter name of the occasion
    And I enter the occasion
    And I  enter the event date
    And I select the product type
    And I enter the description
    And I select private policy make it public
    And I click on submit
    Then my wish list is created
    And I close the webpage


  Scenario: Valid Create wish list for myself with privacy make it private
    When I click on create wishlist
    And I select wish list for myself
    And I enter name of the product
    And I enter the occasion
    And I  enter the event date
    And I select the product type
    And I enter the description
    And I select private policy make it private
    And I click on submit
    Then my wish list is created
    And I close the webpage

  Scenario Outline: Create wish list with invalid date
    When I click on create wishlist
    And I select wish list for myself
    And I enter name of the product
    And I enter the occasion
    And I  enter the event date as "<eventdate>"
    And I select the product type
    And I enter the description
    And I select private policy make it public
    And I click on submit
    Then my wish list is not created
    And I close the webpage

    Examples:
    |eventdate|
    |22Aug2018|
    |222018   |
    |Aug2018  |
    |22Aug    |