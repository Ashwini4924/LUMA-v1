Feature: User Account Creation

Scenario: Create a new user account
    Given user is on the createAccount page
    When user enters valid details
    And submits the registration form
    Then user account should be created successfully