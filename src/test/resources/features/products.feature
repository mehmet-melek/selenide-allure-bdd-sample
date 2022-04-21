Feature: Product Page Tests

  Background:   Login successfully with valid user and valid password
    Given User is at the login page
    When User login with username as "standard_user" and password as "secret_sauce"
    Then User is able to successfully login to application.
    And User is at the product page

  Scenario: Open product page over product image
    When User click to product image
    Then User should see the product detail page open

  Scenario: Open product page over product title
    When User click to product title
    Then User should see the product detail page open


  Scenario: Add To Cart button is pressed once
    When User clicks on Add To Cart button
    Then the number on cart icon should be 1

  Scenario: Add To Cart button is pressed twice
    When User clicks on Add To Cart button
    And User clicks on Add To Cart button
    Then the number on cart icon should be 2

  Scenario: Add To Cart button is pressed twice then Remove button is pressed once
    When User clicks on Add To Cart button
    And User clicks on Add To Cart button
    And User clicks on Remove button
    Then the number on cart icon should be 1


