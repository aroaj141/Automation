Feature: Verify Amazon Details

  Scenario: Verify amazon product search
    Given I am on the amazon page
    When I should enter the product
      | Tv      | samsung |
      | laptop  | Dell    |
      | ios     | iphone  |
      | Android | redmi   |
    Then I validate the outcomes
