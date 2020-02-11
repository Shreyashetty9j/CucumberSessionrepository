Feature: Testing demo webshop login feature

  Scenario: User enters user name and password
    Given the login page is open
    When user enters aravind.guggilla57@gmail.com as username
    And user enters aravind as password
    Then user clicks on login button
    Then demo Web shop page will open successfully
