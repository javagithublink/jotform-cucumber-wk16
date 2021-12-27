Feature: JotForm Submission
  User should be able enter required details and submit form

  Scenario: User can submit form successfully
    When   User clicks on next button from homepage
    And    User enters "Jim" and "Morris"
    And    User clicks on next button from name page
    And    User upload file from "location" in local machine
    And    User clicks on next button from file upload page
    And    User enters signature
    And    User clicks on next button from signature page
    And    User selects date from calender
    And    User clicks on next button from calender page
    And    User selects security question from dropdown
    And    User enters security answer
    And    User clicks on submit button
    Then   User can submit form successfully and can see 'Thank You' message