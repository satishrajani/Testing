Feature: Gmail application testing

  Scenario: Gmail Login Functionality Test
    Given user opens Irish login page
    Then user enters username
    Then user enters Password
    And user click on submit button
    And User_Should_be_logged_in_successfully

  Scenario: Search for selenium jobs
    Given User is logged in to Irishportal
    Then user enter the keyword
    And click on search button

  Scenario: to check for dropdown value
    Given User is logged in to Irishportal
    Then Click and select dropdown value
    And logged out from the portal
    And logout
