Feature: Gmail application testing

  Scenario: Gmail Login Functionality Test
    Given user opens Irish login page
    Then user enters username
    Then user enters Password
    And user click on submit button
    And User_Should_be_logged_in_successfully
    And logged out from the portal
   And logout
