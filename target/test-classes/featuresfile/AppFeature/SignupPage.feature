Feature: Amazon Signup page feature
  Scenario: User navigates to the Amazon signup page
    Given user is on the Amazon homepage
    When user clicks on the "Hello, Sign in" button
    And user clicks on the "Create your Amazon account" button
    Then user should be on the Amazon signup page 




 Scenario: User enters invalid information for signup
    Given  user is on the Amazon signup page
    And user clicks on the "Hello, Sign in" button
    When user enters invalid name. "jay brahmbhatt"
    And user enters invaild numbrer. "9887654567"
    And user enters invalid password "Amit@09999"
    And clicks on the "Create your Amazon account" button
    Then user should see an error message
