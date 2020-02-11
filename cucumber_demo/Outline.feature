
Feature: Login functionality



  Scenario Outline: Login with multiple set of data
    Given User is opening the application
    When user clicks on sign in link
    When user enters "<username>" and "<password>"
    Then user will click on login button
    Then demo wehshop homepage will display
    

    Examples: 
      | username  | password |
      | aravind.guggilla57@gmail.com |aravind |
      | shreyashetty9j@gmail.com | shreya123* |
