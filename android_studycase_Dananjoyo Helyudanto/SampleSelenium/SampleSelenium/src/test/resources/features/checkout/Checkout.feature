@Android
Feature: Checkout
  @Checkout
  Scenario: add to cart 1 item 10 quantity
    Given User is on moka start page
    When User click sign in button on moka start page
    Then User see moka logo
    When User input username "dananjoyoh@yahoo.com"
    And User input password "dananjoyoh"
    And click on Sign In button
    Then User is on favorite tab
    When User click "Cappucino" with quantity 10
    Then User see "Cappucino" in shopping cart
    When User click on Charge button
    And User click on cash suggestion1
    And User click on Charge button in Checkout Pop Up Page
    Then User see "No Change" label


