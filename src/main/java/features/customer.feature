Feature: Customer

  Background:
    Given I open website as http://www.way2automation.com/angularjs-protractor/banking/#/manager/openAccount

  Scenario Outline: Add Customer sucessfully
    When I type some text <firstname> into the search box
    Then I verify the rearch results
    Examples:
      |firstname|
      |Harry    |