@login_page
Feature: Login to app
  As a authorized user should be able to login app
  under with valid credentials.

@login
  Scenario: Login as authorized user.
Given I am on the login page
Then User logs in Authorized user
  And Account Summary page should be displayed


  @wrong_password
  Scenario: Login with Wrong Username
    Given I am on the login page
    Then User enters "wrong" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed


  @invalid_password
  Scenario: Login with Wrong Password
      Given I am on the login page
      Then User enters "username" username and "wrong" password
      And user verifies that "Login and/or password are wrong." message is displayed


@invalid_username_password
  Scenario: Login with wrong username and wrong password
  Given I am on the login page
  Then User enters "invalid" username and "invalid" username
  And user verifies that "Login and/or password are wrong."


