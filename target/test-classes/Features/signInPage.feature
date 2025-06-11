Feature: User Login

  Scenario: Login with registered credentials
    Given user is on the login page
    When user logs in using the registered credentials
    Then user should be logged in successfully