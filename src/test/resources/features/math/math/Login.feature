@LoginFeature @Android
Feature: Login

  @login @Android
  Scenario: Verify user successfully login when using valid username and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login

  @listpage
  Scenario: Verify user successfully explore on list page
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login
    When user go to List Menu
    When user do swipe up on list data
    When user do Long Press on list data
    When user do multiple times on list data
