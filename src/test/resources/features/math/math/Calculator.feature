@calculator @Android
Feature: Calculator
#
  Background: User already on login homepage
    Given user login using valid email "admin" and password "admin"

  Scenario: User successfully using add function
    When user input angka1 "2"
    When user click spinner
    When user choose operation list add
    When user input angka2 "4"
    When user click button equal
    Then user get Hasil "6"

  Scenario: User successfully using divide function
    When user input angka1 "18"
    When user click spinner
    When user choose operation list divide
    When user input angka2 "3"
    When user click button equal
    Then user get Hasil "6"

  Scenario: User successfully using multiple function
    When user input angka1 "7"
    When user click spinner
    When user choose operation list multiple
    When user input angka2 "3"
    When user click button equal
    Then user get Hasil "21"

  Scenario: User successfully using subraction function
    When user input angka1 "8"
    When user click spinner
    When user choose operation list subtraction
    When user input angka2 "3"
    When user click button equal
    Then user get Hasil "5"
