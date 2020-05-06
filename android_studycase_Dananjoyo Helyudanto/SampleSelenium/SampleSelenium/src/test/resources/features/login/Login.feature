
Feature: Login
  @Login
  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    Then User see moka logo
    When User input username "dananjoyoh@yahoo.com"
    And User input password "dananjoyoh"
    And click on Sign In button
    Then User is on favorite tab

  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    Then User see moka logo
    When User input username "081394577665"
    And User input password "dananjoyoh"
    And click on Sign In button
    Then User is on favorite tab