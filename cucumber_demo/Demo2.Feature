Feature: Testing demo registration page

  Scenario: User enters mandatory details
    Given the registration page is opened
    When user enters Shreya as Fisrt name
    And user enters Shetty as Last name
    And user enters shreyashetty9j@gmail.com as Email
    And user enters shreya123* as Password
    And user enters shreya123* as Confirm Password
    Then user clicks on Register button
    Then registration should be successful
