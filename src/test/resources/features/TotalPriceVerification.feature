#Author: Daniyal (iamdaniyalz.pro@gmail.com)

Feature: SportsDirect - Verify Total Price
  I want to verify the total price of the products added in the bag

  Scenario: Verify the total price of products added in the bag
    Given I am on SportsDirect home page
    When I add first product in the bag
    And I add second product in the bag
    Then I go to the bag
    And I add one more instance of first product
    Then I ensure that the total price is calculated correctly
