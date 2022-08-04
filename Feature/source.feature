Feature: Comprehensive BDD Project

  Scenario Outline: Powder under shop products
    Given I have given with tide page <URL>
    When I hover on shop products
    And click on powder under shop products
    Then I should be navigated to Powder page

    Examples: 
      | URL                    |
      | https://tide.com/en-us |

  Scenario: 
    Given I have given with Live Chat on home page
    When I click on Live Chat
    And click on Read more under Loads of Hope
    Then I should be navigated to new page

  Scenario: 
    Given I have given with Bounce Logo on Home page
    When I click on Bounce logo
    And click on Drying on new page
    Then I should be navigated to new page

  Scenario: 
    Given I have given with contact us on home page
    When I click on contact us
    And click on Where to buy on new page
    Then I should be navigated to new page

  Scenario: 
    Given I have given with shop product on home page
    When I mouse hover on shop product
    And click on Fabric Care under it
    Then I should see new page
    When I click on sensitive on new page
    Then i should be navigated to new loaded page
