@Smoke
Feature: Electronics and Computers search
  As a User
  I should be able to search for products
  so that I am able to view results

  Background:
    Given user is on the homepage

  Scenario Outline: List all the Samsung phones with the User given specifications
    Given User landed on the HomePage
    When User selects "<Category>" from the Main menu
    And selects "<SubCategory>"
    And Selects the Mobile phones "<Type>"
    Then User should see the specifications for selected Mobile
    Examples:
    |Category                         |SubCategory           |  Type|
    | Electronics and Computers       |Phones and Accessories| Samsung|