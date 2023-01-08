  @Rediff
  Feature: Validating Login Page of rediff.com
  I want to validate positive and negative scenarios for this page
  
  Background: I am giving common steps to run before all scenarios
    Given I open a chrome browser
    And I enter the url "https://rediff.com"
    And I click on the signin link
    Then I am redirected to the login page
    And I enter the correct username "seleniumpanda@gmail.com"
    And I enter the correct password "Selenium@123"
    When I click on the SignIn button
    Then I am logged into my rediffmail inbox
  

  @ValidateWithCorrectCredentials
  Scenario: Validate login functionality with correct username and password
    But I see there is always a lag of 4 to 5 seconds
    
    
  @ValidateInboxPage
  Scenario: Validate inbox page of rediffmail
    And I can see my profile name on top right
    And I see the Logout link under my profile name
