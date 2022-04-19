Feature: Login Features

  Scenario: Login successfully with valid user and valid password
    Given User is at the login page
    When User enters username as "standard_user" and password as "secret_sauce"
    And User clicks on login button
    Then User is able to successfully login to application.

  Scenario: Failed login with invalid user and valid password
    Given User is at the login page
    When User enters username as "invalid_user" and password as "secret_sauce"
    And User clicks on login button
    Then User should see "Epic sadface: Username and password do not match any user in this service" error message

  Scenario: Failed login with valid user and invalid password
    Given User is at the login page
    When User enters username as "standard_user" and password as "invalid_password"
    And User clicks on login button
    Then User should see "Epic sadface: Username and password do not match any user in this service" error message

  Scenario: Failed login with invalid user and invalid password
    Given User is at the login page
    When User enters username as "invalid_user" and password as "invalid_password"
    And User clicks on login button
    Then User should see "Epic sadface: Username and password do not match any user in this service" error message
